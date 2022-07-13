package homework.books.storage;

import homework.books.execution.NotFoundException;
import homework.books.models.User;


public class UserStorage {
    private User[] array = new User[10];
    private int size = 0;


    public void add(User User) {
        if (array.length == size) {
            extend();
        }
        array[size++] = User;
    }

    private void extend() {
        User[] temp = new User[array.length + 10];
        System.arraycopy(array, 0, temp, 0, array.length);
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


    public User getUserByEmil(String email) {
        for (int i = 0; i < size; i++) {
            if (email.equals(array[i].getEmail())) {
                return array[i];
            }
        }
        return null;
    }

    public User getUserByIndex(int index) {
        if (index >= 0 && index < size) {
            if (array[index] == null) {
                throw new NotFoundException("you have not User in this " + index + " index");
            } else {
                return array[index];
            }


        } else {
            throw new NotFoundException("its not correct index");

        }

    }

    public String getUserNameByIndex(int index) {
        if (index >= 0 && index < size) {
            if (array[index].getName() == null) {
                throw new NotFoundException("you have not User in this " + index + " index");
            } else {
                return array[index].getName();
            }


        } else {
            throw new NotFoundException("its not correct index");

        }
    }

    public User getLastUser() {
        return array[size - 1];
    }

}
