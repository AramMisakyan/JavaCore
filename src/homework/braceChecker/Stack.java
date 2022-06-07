package homework.braceChecker;

public class Stack {
    private char[] array = new char[100];
    private int index;

    Stack() {
        index = -1;
    }

    public void push(char value) {
        if (index == array.length - 1) {
            System.out.println("stack is full");
        } else {
            array[++index] = value;
        }
    }

    char pop() {
        if (index < 0) {

            return ' ';
        } else {
            return array[index--];
        }
    }


}
