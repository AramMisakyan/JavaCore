package homework.classExample.arrayUtil;

public class ArrayUtil {

    int getMaxNumInArray(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    int getMinNumInArray(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    void showAllElementsArray(int array[]) {
        for (int nums : array) {
            System.out.print(nums + " ");
        }

    }

    void getEvenElementsInArray(int array[]) {

        for (int even : array) {
            if (even % 2 == 0) {
                System.out.print(even + " ");
            }
        }

    }

    int evenElementsQauntInArray(int array[]) {
        int qaunt = 0;
        for (int even : array) {
            if (even % 2 == 0) {
                qaunt++;
            }
        }
        return qaunt;
    }

    void getOddElementsInArray(int array[]) {
        for (int odd : array) {
            if (odd % 2 != 0) {
                System.out.print(odd + " ");
            }
        }

    }

    int oddElementsQauntInArray(int array[]) {
        int qaunt = 0;
        for (int even : array) {
            if (even % 2 != 0) {
                qaunt++;
            }
        }
        return qaunt;
    }

    int sumOllElementsInArray(int array[]) {
        int sum = 0;
        for (int num : array) {
            sum += num;

        }
        return sum;
    }

    double articalMean(int array[]) {
        double sum = 0;
        int qaunt = 0;
        for (int num : array) {
            qaunt++;
            sum += num;
        }
        double artMean = sum / qaunt;
        return artMean;

    }

    void arraySort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }



}
