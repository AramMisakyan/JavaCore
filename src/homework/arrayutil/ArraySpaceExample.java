package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', ' ', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int resLength = 0;
        int resFirstIndex = 0;
        int resLastIndex = 0;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {

                resFirstIndex = i;
                break;
            }
        }
        for (int i = spaceArray.length - 1; i >= 0; i--) {
            if (spaceArray[i] != ' ') {

                resLastIndex = i;
                break;
            }
        }

        resLength = resLastIndex - resFirstIndex + 1;

        char[] result = new char[resLength];
        int resIndex=0;
        for (int i = resFirstIndex; i <= resLastIndex; i++) {
            result[resIndex] = spaceArray[i];
            resIndex++;
        }
        System.out.println();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println(result.length);
        //        for (int i = 0; i < spaceArray.length; i++) {
//            if (spaceArray[i] != ' ') {
//                for (int j = spaceArray.length - 1; j >= 0; j--) {
//                    if (spaceArray[j] != ' ') {
//
//                        for (int k = i; k <= j; k++) {
//                            resLength++;
//                        }
//                        resFirstIndex = i-1;
//                        resLastIndex = j - 1;
//
//                    } else if (resLength == 0) {
//                        continue;
//                    } else {
//                        break;
//                    }
//                }
//
//            } else if (resLength == 0) {
//                continue;
//            } else {
//                break;
//            }
//
//        }


    }


}
