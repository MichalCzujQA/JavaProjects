package homework_14;

import javax.print.DocFlavor;

/*

Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
 */
public class Task0 {
    public static void main(String[] args) {

        String stringTest = "aaaaavbFDSSVSQW!.//";
        System.out.println(stringTest);
        System.out.println(stringToUpperCase(stringTest));

    }

    public static String stringToUpperCase(String string) {

        if (string == null) return null;

        char[] chars = string.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            //Option 1
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }

        }
        //return String.valueOf(chars);
        // return new String(chars);

        //Option 2

        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if (current >= 97 && current <= 122) {
                result += String.valueOf((char) (current - 32));
            } else {
                result += String.valueOf(current);
            }
        }


        return result;

    }
}
