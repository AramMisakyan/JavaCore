package homework.books;

import homework.books.commands.Commands;
import homework.books.models.Author;
import homework.books.models.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

public class BookDemo implements Commands {
    private static int count;
    private static String title;
    private static String genre;
    private static double price;

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();


    public static void main(String[] args) {

        commandsConsole();

        System.out.println(authorStorage.isEmpty());
    }

    public static void commandsConsole() {
        boolean run = true;
        while (run) {
            startCommandsPrint();
            int command = Integer.parseInt(scanner.nextLine());
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
                case PRINT_AUTORES:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("error enter not correct command");
            }
        }
    }

    public static void startCommandsPrint() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for Add Book");
        System.out.println("Please input 2 Print All Books");
        System.out.println("Please input 3 Print Books by AuthorName");
        System.out.println("Please input 4 Print Books by Genre ");
        System.out.println("Please input 5 Print books by price range");
        System.out.println("Please input 6 for Add Author");
        System.out.println("Please input 7 Print All Authors");


    }

//    public static void addAuthorCommands() {
//        System.out.println("Please input 0 for EXIT");
//        System.out.println("Please input 1 for Add Name");
//        System.out.println("Please input 2 for Add Surname");
//        System.out.println("Please input 3 for Add Email");
//        System.out.println("Please input 4 enter Author gender MALE or FEMALE");
//        System.out.println("Please input 5 Print All Author ");
//    }

    public static void addAuthor() {
        System.out.println("Please enter Name");
        String name = scanner.nextLine();
        System.out.println("Please enter Surname");
        String surName = scanner.nextLine();
        System.out.println("Please enter Email");
        String email = scanner.nextLine();
        System.out.println("Please enter gender MALE or FEMALE");
        String gender = scanner.nextLine();
        boolean trueGnder = false;
        while (!trueGnder) {
            if (gender.equals("MALE") || gender.equals("FEMALE")) {
                Author author = new Author(name, surName, email, gender);
                authorStorage.add(author);
                System.out.println("Author added");
                trueGnder = true;
            } else {
                System.out.println("is not correct gender Please enter MALE or FEMALE");
                gender = scanner.nextLine();
                if (gender.equals("MALE") || gender.equals("FEMALE")) {
                    trueGnder = true;
                }
                System.out.println("Author added");
            }
        }

    }


    public static void addBook() {
        if (authorStorage.isEmpty()) {
            System.out.println("You have not  Author Please enter new Author");
            addAuthor();
            addBook();
        } else {

            System.out.println("if you wont enter new Author please enter 1");
            System.out.println("if you wont choose in our Authors enter 2 ");
            int chooseAuthor = Integer.parseInt(scanner.nextLine());
            if (chooseAuthor == 1) {
                addAuthor();
                bookOptions();
                Author author = authorStorage.getLastAuthor();
                Book book = new Book(title, author, price, genre, count);
            }
            else if (chooseAuthor == 2) {
                authorStorage.print();
                System.out.println("Please choose Author by Index");
                int index = Integer.parseInt(scanner.nextLine());
                Author author = authorStorage.getAuthorByIndex(index);
                if (author == null) {
                    System.out.println("not correct index");
                    addBook();
                } else {
                    bookOptions();
                    count++;
                    Book book = new Book(title, author, price, genre, count);
                    bookStorage.add(book);
                    System.out.println("Book Added");
                }
            }
            else {
                addBook();
            }
        }


    }

    public static void bookOptions() {
        System.out.println("Please enter title");
        title = scanner.nextLine();
        System.out.println("Please enter Book Price");
        String priceStr = scanner.nextLine();
        price = Double.parseDouble(priceStr);
        System.out.println("Please enter Genre");
        genre = scanner.nextLine();
    }

    public static void getBookByAuthorName() {
        System.out.println("Please enter Author Name");
        String authorName = scanner.nextLine();
        bookStorage.searchBookByAuthorName(authorName);
    }

    public static void getBookByGenre() {
        System.out.println("Please enter Genre");
        String genre = scanner.nextLine();
        bookStorage.searchBookByGenre(genre);
    }

    public static void getBookPriceRange() {
        System.out.println("enter Lower Price");
        String lowerPriceStr = scanner.nextLine();
        double lowerPrice = Double.parseDouble(lowerPriceStr);
        System.out.println("enter Upper Price");
        String upperPriceStr = scanner.nextLine();
        double upperPrice = Double.parseDouble(upperPriceStr);
        bookStorage.searchBookInPriceRange(lowerPrice, upperPrice);
    }
}
