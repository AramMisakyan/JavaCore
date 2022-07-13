package homework.books.commands;

import homework.books.models.Author;

public interface Commands {
    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHOR = 3;
    int PRINT_BOOK_BY_GENRE = 4;
    int PRINT_BOOKS_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_AUTHORS = 7;


    int LOGIN = 1;
    int REGISTER = 2;


    public static void startCommandsPrintWithAdmin() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for Add Book");
        System.out.println("Please input 2 Print All Books");
        System.out.println("Please input 3 Print Books by AuthorName");
        System.out.println("Please input 4 Print Books by Genre ");
        System.out.println("Please input 5 Print books by price range");
        System.out.println("Please input 6 for Add Author");
        System.out.println("Please input 7 Print All Authors");


    }    public static void startCommandsPrintWithUser() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 2 Print All Books");
        System.out.println("Please input 3 Print Books by AuthorName");
        System.out.println("Please input 4 Print Books by Genre ");
        System.out.println("Please input 5 Print books by price range");
        System.out.println("Please input 7 Print All Authors");


    }
    public static void printLoginCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for Login");
        System.out.println("Please input 2 for Register");
    }


}
