package homework.practice;

public class PracticeHomework {
    long secontConvert(int minutes) {

        return minutes * 60;

    }

    int deysInYears(int years) {

        return years * 365;

    }

    int nextNumber(int number) {

        return ++number;

    }

    boolean lessThanOrEqualToZero(int number) {

        if (number <= 0) {
            return true;
        } else {
            return false;
        }

    }

    boolean reverseBool(boolean value) {

        return !value;

    }

    int maxLengthArray(int[] array1, int[] array2) {

        if (array1.length>array2.length){
            return array1.length;
        }
        else {
            return array2.length;
        }

    }


}
