package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, -10, 5, -9, 0, 12, 5, 65, 10};
        int num = 0;

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                num = numbers[i];
                if (numbers[j] > numbers[i]) {
                    numbers[i] = numbers[j];
                    numbers[j] = num;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                num = numbers[i];
                if (numbers[j] < numbers[i]) {
                    numbers[i] = numbers[j];
                    numbers[j] = num;
                }

            }

        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }

    }
}
