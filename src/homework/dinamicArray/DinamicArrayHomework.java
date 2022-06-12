package homework.dinamicArray;

public class DinamicArrayHomework {

    private int[] array = new int[10];
    private int size = 0;


    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ. Եթե ունենք՝ false

    public boolean isEmpty() {
        return size == 0;
    }

    //Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը, եթե չկա թող վերադարձնի 0;

    public int getByIndex(int index) {
        if (index < size && index >= 0) {
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    return array[i];
                }
            }
        }
        return 0;
    }

    //Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value, և եթե մեր մասիվի մեջ ունենք այդ թվից, կվերադարձնի իր ինդեքսը. եթե շատ ունենք, պետք է վերադարձնել առաջինի ինդեքսը
    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        System.out.println("You have not this value: " + value);
        return -1;
    }

    //Գրել մեթոդ set անունով, որը կընդունի int index, int value և վալյուն կդնի տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).

    public void setValueInIndex(int index, int value) {

        if (index < size) {
            array[index] = value;
        } else {

            System.out.println("your array have max index: " + (size - 1));

        }

    }
    //Գրել մեթոդ add(int index, int value) որը տրված վելյուն կդնի տրված ինդեքսի տեղը, իսկ էղած թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի

    public void add(int index, int value) {
        int temp;
        temp = array[index];
        array[index] = value;

        if (array.length == size) {
            extend();
        }
        size++;
        for (int i = index + 1; i < size; i++) {
            int temp2 = array[i];
            array[i] = temp;
            temp = temp2;
        }


    }

    //Գրել մեթոդ delete(int index) որ տանք ինդեքսը, այդ ինդեքսի տակ գտնվող թիվը հեռացնի մասիվից. (նոր մասիվ պետք չէ սարքել)
    void delete(int index) {
        if (index < size) {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            array[--size] = 0;
        } else {
            System.out.println("you have not number in index: " + index);
        }

    }

    public int getLastIndex() {
        return size - 1;
    }

}


