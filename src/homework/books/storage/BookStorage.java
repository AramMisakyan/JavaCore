package homework.books.storage;

import homework.books.models.Book;

public class BookStorage {
    private Book[] array = new Book[10];
    private int size = 0;


    public void add(Book book) {
        if (array.length == size) {
            extend();
        }
        array[size++] = book;
    }

    private void extend() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + array[i] + " ");
        }
    }

    public int getSize() {
        return size;
    }

    public void searchBookByAuthorName(String name) {
        boolean trueAuthor = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthor().getName().equals(name)) {
                System.out.println(array[i].getAuthor());
                trueAuthor = true;
            }
            if (!trueAuthor) {
                System.out.println("have not book in this Author");

            }
        }
    }

    public void searchBookByGenre(String genre) {
        boolean trueGenre = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);
                trueGenre = true;
            }
            if (!trueGenre) {
                System.out.println("you have not book in this genre");
            }
        }
    }
public void changeAuthorInBook(){}
    public void searchBookInPriceRange(double lower, double upper) {
        boolean trueRange = false;
        if (lower > upper) {
            System.out.println("you enter not correct lower and upper price ");
        }else {
            for (int i = 0; i < size; i++) {
                if (array[i].getPrice() >= lower && array[i].getPrice() <= upper) {
                    System.out.println(array[i]);
                    trueRange = true;
                }
                if (!trueRange){
                    System.out.println("We have not books in this range");
                }
            }
        }


    }

}