package homework_14;

/*
Написать метод, принимающий строку и возвращающий новую строку,
состоящую из 2го и 3го символа входящей строки, переведенных в верхний регистр.
Распечатать полученный результат в методе main

"Hello" -> "EL"
"He" -> "E"
"H" -> ???
 */

public class Task4 {

    public static void main(String[] args) {
        String string = "Hello";

        String str = substringToUpperCase(string);
        System.out.println(str);


       // if (str.isEmpty()) ;
       // if (str.length() == 0) ;

    }

    public static String substringToUpperCase(String string) {
        if (string == null) return "";

        String result = "";

        if (string.length() > 1) {
            char char2 = string.charAt(1);
            result += char2;
        }

        if (string.length() > 2) {
            char char3 = string.charAt(2);
            result += char3;
        }


        result = result.isEmpty() ? "???" : result;


        return result.toUpperCase();
    }

}
