package lesson_05;

public class StringMethods {
    public static void main(String[] args) {

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";
        String str4 = "string4";


        String concatStr = str1 + str2 + str3;

        System.out.println(concatStr);

        concatStr = str1 + " " + str3 + " " + "String";

        System.out.println(concatStr);

        String concatStr2 = str1.concat(str3);

        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3).toUpperCase();

        System.out.println(concatStr2);

        concatStr2 = str1.concat(str3);
        concatStr2 = concatStr2.toUpperCase();
        System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3).concat(" ").concat(str4);
        System.out.println(concatStr3);

        String concatStrJoin = String.join(" ", str1, str3, str4);
        System.out.println(concatStrJoin);
        concatStrJoin = String.join("-", str1, str3, str4);
        System.out.println(concatStrJoin);

        int int1 = 1;
        int int2 = 2;

        System.out.println("Sum: " + (int1 + int2));

        int age = 18;
        System.out.println("My age " + age);

        System.out.println("========================");

        String digits = "0123456789-101";

        int len = digits.length();
        System.out.println("Length of String: " + len);
        // System.out.println(digits.length());

        char firstChar = digits.charAt(0);
        System.out.println(firstChar);

        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println(lastChar);

        //System.out.println(digits.charAt(50));

        String substring = digits.substring(5);
        System.out.println("substring: " + substring);


        System.out.println(digits);

        substring = digits.substring(5,8);
        System.out.println(substring);

        int index = digits.indexOf("4");
        System.out.println("index: " + index);

        index = digits.indexOf("45");
        System.out.println("index: " + index);

        index = digits.indexOf("1");
        System.out.println(index);

        index =digits.lastIndexOf("1");
        System.out.println(index);

        System.out.println(digits.indexOf("01"));
        System.out.println(digits.lastIndexOf("01"));

        System.out.println("==========================================\n");

        String target = "abcabeabd";
        String output = target.replace("ab", "AB");
        System.out.println(output);

        output = target.replaceFirst("ab", "AB");
        System.out.println(output);

        output = target.replaceAll("ab", "AB");
        System.out.println(output);
    }
}
