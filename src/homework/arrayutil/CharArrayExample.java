package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        //խնդիր 1

        char[] chars = {'j', 'a', 'v', 'o', 'm', 'v', 'e', 'o'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("Կա " + count + " հատ " + c);

        //խնդիր 2


        char[] chars2 = {'j', 'a', 'v', 'o', 'm', 'v', 'e', 'o'};
        int middleIndex = chars2.length / 2;
        System.out.println(chars2[middleIndex] + "" + chars2[middleIndex - 1]);

        //խնդիր 3

        char[] chars3 = {'j', 'a', 'v', 'o', 'm', 'v', 'e', 'o', 'l', 'y'};
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            System.out.println("true");

        } else {
            System.out.println("false");
        }

        //Խնդիր 4

        char[] bobArray = {'b', 'o', 'b', 'c', 'd', 'b', 'b', 'c', 'i', 'b', 'f', 'b'};

        for (int i = 0; i < bobArray.length; i++) {
            int nextTwoIndex = i + 2;
            int nextIndex = i + 1;
            if (nextTwoIndex > bobArray.length - 3) {
                nextTwoIndex = bobArray.length - 1;

            }
            if (nextIndex > bobArray.length - 2) {
                nextIndex = i;
            }
            if (bobArray[i] == 'b' && bobArray[nextTwoIndex] == 'b' && i != bobArray.length - 1) {
                System.out.println(bobArray[i] + "" + bobArray[nextIndex] + "" + bobArray[nextTwoIndex] + " -> true");
            }
            else if (bobArray[i] == 'b' && bobArray[nextTwoIndex] != 'b' && i != bobArray.length - 1){
                System.out.println(bobArray[i] + "" + bobArray[nextIndex] + "" + bobArray[nextTwoIndex] + " -> false");
            }

        }

        System.out.println();
        //Խնդիր 5

        char[] text = {' ','b',' ',' ','a','r',' ','e','v',' ',' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i]!=' '){
                System.out.print(text[i]);
            }

        }

//        char[] text ={'b','a','r','e','v'};
//        System.out.println(text[1]+""+text[2]);

    }
}
