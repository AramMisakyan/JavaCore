package homework.dinamicArray;

public class DinamicArrayTest {
    public static void main(String[] args) {

        DinamicArrayHomework dinamicArrayHomework = new DinamicArrayHomework();
        for (int i = 0; i < 20; i++) {
            dinamicArrayHomework.add(i);
        }
        dinamicArrayHomework.delete(4);
        dinamicArrayHomework.add(2, 170);
        dinamicArrayHomework.add(1,7110);
        dinamicArrayHomework.add(5,710);
        dinamicArrayHomework.add(7, 4);
        dinamicArrayHomework.add(11, 90);
        System.out.println(dinamicArrayHomework.getByIndex(4));
        System.out.println(dinamicArrayHomework.getByIndex(0));
        System.out.println(dinamicArrayHomework.getFirstIndexByValue(152));
        System.out.println(dinamicArrayHomework.getFirstIndexByValue(15));
        System.out.println();
        dinamicArrayHomework.setValueInIndex(11, 3);
        dinamicArrayHomework.printArray();
    }

}
