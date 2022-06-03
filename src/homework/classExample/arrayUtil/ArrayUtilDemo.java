package homework.classExample.arrayUtil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] arrayNums = {20, 8, 7, 56, 50, 1, 10, 222, 56, -23, 27, 100, 19};
        int qaunt;
        int sum;
        double artMean;

        arrayTest.getOddElementsInArray(arrayNums);
        System.out.println();

        qaunt = arrayTest.oddElementsQauntInArray(arrayNums);
        System.out.println(qaunt);

        System.out.println();

        sum = arrayTest.sumOllElementsInArray(arrayNums);
        System.out.println(sum);

        System.out.println();

        artMean = arrayTest.articalMean(arrayNums);
        System.out.println(artMean);

        System.out.println();
        arrayTest.arraySort(arrayNums);
        arrayTest.showAllElementsArray(arrayNums);

    }

}
