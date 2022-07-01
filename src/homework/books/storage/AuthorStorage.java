package homework.books.storage;

import homework.books.models.Author;


public class AuthorStorage {
    private Author[] array = new Author[10];
    private int size = 0;


    public void add(Author author) {
        if (array.length == size) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
        Author[] temp = new Author[array.length + 10];
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

    public boolean isEmpty() {
        return size == 0;
    }


    public Author getAuthorByName(String name) {
        for (int i = 0; i < size; i++) {
            if (name.equals(array[i].getName())) {
                return array[i];
            }
        }
        System.out.println("you have not this Author");
        return null;
    }

    public Author getAuthorByIndex(int index) {
        if (index >= 0 || index < size) {
            return array[index];
        } else {
            System.out.println("you have not Author in this index");
            return null;
        }

    }

    public String getAuthorNameByIndex(int index) {
        if (index >= 0 || index < size) {
            return array[index].getName();
        } else {
            System.out.println("you have not Author in this index");
            return null;
        }
    }

    public Author getLastAuthor() {
        return array[size - 1];
    }

}
