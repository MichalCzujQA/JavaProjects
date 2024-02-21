package homework_19;
/*
Написать метод по поиску строки в массиве строк. На вход метод принимает массив строк, и строку для поиска.
 */

import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {

        String[] strings = {"Java", "Python", "hello", "world"};

        int[] findStrings = searchString(strings,"Java", "world");
        System.out.println(Arrays.toString(findStrings));

        boolean isFind = findStrings[0] >=0 && findStrings[1] >= 0;
        System.out.println(isFind);

    }

    public int searchString(String[] strings, String findMe) {

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(findMe)) {
                return i;
            }
        }


        return -1; // return false;


    }

    public static int[] searchString(String[] strings, String findMe1, String findMe2) {
        int[] result = {-1, -1};

        for (int i = 0; i < strings.length; i++) {

            if (strings[i].equals(findMe1)) {
                result[0] = i;

            }
            if (strings[i].equals(findMe2)){
                result[1] = i;
            }
        }


    return result;




    }


}
