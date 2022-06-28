package homework.books;

import classwork.students.StudentStorage;

import java.util.Scanner;

public class BookDemo {
    private static int count;
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for Add Book");
            System.out.println("Please input 2 Print All Books");
            System.out.println("Please input 3 Print Books by AuthorName");
            System.out.println("Please input 4 Print Books by Genre ");
            System.out.println("Please input 5 Print books by price range");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    bookStorage.print();
                    break;
                case 3:
                    getBookByAuthorName();
                    break;
                case 4:
                    getBookByGenre();
                    break;
                case 5:
                    getBookPriceRange();
                    break;
                default:
                    System.out.println("error enter not correct command");
            }
        }
    }

    public static void addBook() {
        System.out.println("Please enter title");
        String title = scanner.nextLine();
        System.out.println("Please enter Author Name");
        String authorName = scanner.nextLine();
        System.out.println("Please enter Book Price");
        String priceStr = scanner.nextLine();
        double price = Double.parseDouble(priceStr);
        System.out.println("Please enter Genre");
        String genre = scanner.nextLine();
        count++;
        Book book = new Book(title, authorName, price, genre, count);
        bookStorage.add(book);

    }

    public static void getBookByAuthorName() {
        System.out.println("Please enter Author Name");
        String authorName = scanner.nextLine();
        bookStorage.searchBookByAuthor(authorName);
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
