package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int array_nums[] = {20, 50, 7, 56, 500, 1, 10, 222, 56, 23, 27, 1000, 91};
        int oddcaunt = 0;
        int evencaunt = 0;



        int maxnum = array_nums[0];
        for (int i = 1; i < array_nums.length; i++) {
            if (array_nums[i] > maxnum) {
                maxnum = array_nums[i];
            }
        }


        System.out.println("maxnum = " + maxnum);




        int minnum = array_nums[0];
        for (int i = 1; i < array_nums.length; i++) {
            if (array_nums[i] < minnum) {
                minnum = array_nums[i];
            }
        }



        System.out.println("minnum = " + minnum);



        for (int i = 0; i < array_nums.length; i++) {

            if (array_nums[i] % 2 == 0) {
                evencaunt++;
            } else {

                oddcaunt++;
            }
        }
        System.out.println("oddcaunt = " + oddcaunt);
        System.out.println("evencaunt = " + evencaunt);



        int array_odd[] = new int[oddcaunt];
        int array_even[] = new int[evencaunt];
        int indexodd = 0;
        int indexeven = 0;
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] % 2 == 0) {
                array_even[indexeven] = array_nums[i];
                indexeven++;

            } else {
                array_odd[indexodd] = array_nums[i];
                indexodd++;
            }

        }
        for (int i = 0; i < array_odd.length; i++) {
            System.out.print(array_odd[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < array_even.length; i++) {
            System.out.print(array_even[i] + " ");
        }


    }
}
