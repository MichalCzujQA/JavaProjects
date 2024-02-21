package homework_14;

/*
Написать метод, принимающий строку и один или два индекса (перегрузка).
Метод должен возвращать подстроку начиная с первого индекса (включительно) и
заканчивая вторым индексом (не включительно) Если индекс 1 - начиная с индекса и до конца строки.

Функционал повторяет метод String.substring(), так что этот метод использовать не нужно.
 Оригинальный метод ломает программу, если введены не корректные индексы. Наш метод аварийно завершать программу не должен.
 */
public class Task2 {
    public static void main(String[] args) {

        String str = "0123456789";

        System.out.println(substring(str, 2, 5));
        System.out.println(substring(str, 2));

    }


    public static String substring(String string, int startIndex) {
        return substring(string, startIndex, string.length());
    }


    public static String substring(String string, int startIndex, int endIndex) {

        String result = "";

        if (string == null || startIndex < 0
                || startIndex > string.length()
                || endIndex > string.length()
                || endIndex <= startIndex)
            return result;


        char[] chars = new char[endIndex - startIndex];


        //Option 1
        for (int i = 0; i < chars.length; i++) {
            chars[i] = string.charAt(i + startIndex);
        }


        //Option 2
        for (int i = startIndex; i < endIndex; i++) {
            result += "" + string.charAt(i);
        }
        // return result;
        return String.valueOf(chars);

    }
}
