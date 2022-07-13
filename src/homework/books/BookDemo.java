package homework.books;

import homework.books.commands.Commands;
import homework.books.enums.Gender;

import homework.books.execution.NotFoundException;
import homework.books.models.Author;
import homework.books.models.Book;
import homework.books.models.Role;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.storage.UserStorage;
import homework.books.models.User;

import java.util.Scanner;

public class BookDemo implements Commands {
    private static int count;
    private static String title;
    private static String genre;
    private static double price;

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) {

        commandsConsoleFromLogin();



    }



    public static void loginAdmin() {
        System.out.println("Please enter login");
        String login = scanner.nextLine().trim();
        System.out.println("Please enter password");
        String password = scanner.nextLine().trim();
        if (!login.equals("admin") || !password.equals("123456")) {
            System.out.println("you entered not correct login or password Please try again");
            loginAdmin();
        }
    }

    public static void commandsConsoleFromLogin() {
        boolean run = true;
        while (run) {
            Commands.printLoginCommands();
            int command = enterOnlyIntNum();
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;

                default:
                    System.out.println("error enter not correct command");
            }
        }
    }

    public static void login() {
        System.out.println("Please input email,password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmil(emailPassword[0]);
        if (user == null) {
            System.out.println("not correct email");
        } else {
            if (!user.getPassword().equals(emailPassword[1])) {
                System.out.println("not correct password");
            }
            else {
                if(user.getRole()==Role.ADMIN){
                    commandsConsoleWithAdmin();

                }else if (user.getRole()==Role.USER){
commandsConsoleWithUser();
                }

            }
        }
    }

    private static void register() {
        System.out.println("Please input name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("Please input correct user data");
        } else {
            if (userStorage.getUserByEmil(userData[2]) == null) {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setRole(Role.USER);
                userStorage.add(user);
                System.out.println("you registered");
            } else {
                System.out.println("you have User in this email " + userData[2]);
            }
        }
    }

    public static void commandsConsoleWithUser() {
        boolean run = true;
        while (run) {
            Commands.startCommandsPrintWithUser();
            int command = enterOnlyIntNum();
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR:
                    getBookByAuthorName();
                    break;
                case PRINT_BOOK_BY_GENRE:
                    getBookByGenre();
                    break;
                case PRINT_BOOKS_PRICE_RANGE:
                    getBookPriceRange();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("error enter not correct command");
            }
        }
    }
    public static void commandsConsoleWithAdmin() {
        boolean run = true;
        while (run) {
            Commands.startCommandsPrintWithAdmin();
            int command = enterOnlyIntNum();
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR:
                    getBookByAuthorName();
                    break;
                case PRINT_BOOK_BY_GENRE:
                    getBookByGenre();
                    break;
                case PRINT_BOOKS_PRICE_RANGE:
                    getBookPriceRange();
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("error enter not correct command");
            }
        }
    }



    public static void addAuthor() {
        System.out.println("Please enter Author Name");
        String name = scanner.nextLine().trim();
        System.out.println("Please enter Author Surname");
        String surName = scanner.nextLine().trim();
        System.out.println("Please enter Author Email");
        String email = scanner.nextLine().trim();
        System.out.println("Please enter Author gender  MALE or FEMALE");

        Gender gender = gender();
        Author author = new Author(name, surName, email, gender);
        authorStorage.add(author);
        System.out.println("Author added");

    }

    public static Gender gender() {
        Gender gender;
        try {
            gender = Gender.valueOf(scanner.nextLine().trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("is not correct gender Please enter MALE or FEMALE");
            gender = gender();
        }
        return gender;
    }


    public static void addBook() {
        Author author;
        if (authorStorage.isEmpty()) {
            System.out.println("You have not  Author Please enter new Author");
            addAuthor();
            author = authorStorage.getLastAuthor();
        } else {
            author = addOrChooseAuthor();
        }
        bookOptions();
        count++;
        Book book = new Book(title, author, price, genre, count);
        bookStorage.add(book);
        System.out.println("Book Added");

    }

    public static Author addOrChooseAuthor() {
        System.out.println("if you wont enter new Author please enter 1");
        System.out.println("if you wont choose in our Authors enter 2 ");
        int chooseAuthor = enterOnlyIntNum();
        switch (chooseAuthor) {
            case 1:
                addAuthor();
            case 2:
                System.out.println("Please choose Author by Index");
                authorStorage.print();
                boolean trueIndex = true;
                while (trueIndex) {
                    int index = enterOnlyIntNum();
                    authorStorage.print();
                    try {
                        Author author = authorStorage.getAuthorByIndex(index);
                        trueIndex = false;
                    } catch (NotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
            default:
                System.out.println("not correct command try again");
                addOrChooseAuthor();
        }
        return authorStorage.getLastAuthor();
    }


    public static void bookOptions() {
        System.out.println("Please enter title");
        title = scanner.nextLine().trim();
        System.out.println("Please enter Book Price");
        do {
            price = enterOnlyDouble();
            if (price < 0) {
                System.out.println("price can not be minus");
            }
        } while (price < 0);

        System.out.println("Please enter Genre");
        genre = scanner.nextLine().trim();
    }

    public static int enterOnlyIntNum() {
        try {
            int num = Integer.parseInt(scanner.nextLine().trim());
            return num;
        } catch (NumberFormatException e) {
            System.out.println("its not Please enter only number");
            return enterOnlyIntNum();
        }
    }

    private static double enterOnlyDouble() {
        try {
            double num = Double.parseDouble(scanner.nextLine().trim());
            return num;
        } catch (NumberFormatException e) {
            System.out.println("its not correct, Please enter only number");
            return enterOnlyDouble();
        }
    }

    public static void getBookByAuthorName() {
        System.out.println("Please enter Author Name");
        bookStorage.searchBookByAuthorName(scanner.nextLine().trim());
    }

    public static void getBookByGenre() {
        System.out.println("Please enter Genre");
        bookStorage.searchBookByGenre(scanner.nextLine().trim());
    }

    public static void getBookPriceRange() {
        System.out.println("enter Lower Price");
        double lowerPrice = enterOnlyDouble();
        System.out.println("enter Upper Price");
        double upperPrice = enterOnlyDouble();
        bookStorage.searchBookInPriceRange(lowerPrice, upperPrice);
    }
}
