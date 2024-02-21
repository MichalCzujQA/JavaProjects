package homework_05;

/*
Task 03 *опционально

Даны строки разной длины (длина - четное число)

"string"
"code"
"Practice"
Необходимо распечатать два средних символа строки. Например, если дана строка "string" - результат будет "ri", для строки "code" результат "od",
для "Practice" результат "ct".
 */
public class Task3 {
    public static void main(String[] args) {
        String str = "string";
        String str1 = "code";
        String str2 = "Practice";
        int middleIndex = str2.length() / 2;
        System.out.println(str2.charAt(middleIndex));


        String substring = str2.substring(middleIndex - 1, middleIndex + 1);

        System.out.println(substring);

        System.out.println("" + str2.charAt(middleIndex -1 ) + str.charAt(middleIndex));
    }
}
