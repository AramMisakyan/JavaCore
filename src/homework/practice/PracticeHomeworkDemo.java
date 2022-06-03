package homework.practice;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {

        PracticeHomework tester = new PracticeHomework();

        System.out.println(tester.reverseBool(false));
        System.out.println();

        int[]arr1=new int[10];
        int[]arr2=new int[17];
        System.out.println(tester.maxLengthArray(arr1,arr2));

    }
}
