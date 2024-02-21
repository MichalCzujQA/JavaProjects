package lesson_21;

public class StringBuilderExample {

    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello").append(", ").append("World!");

        String str = "Hello" + ", " + "World";
        System.out.println(str);
        String result = stringBuilder.toString();
        System.out.println(result);


        stringBuilder.insert(3, "Java");
        System.out.println(stringBuilder.toString());

        stringBuilder.delete(3,6);
        System.out.println(stringBuilder.toString());

        stringBuilder.deleteCharAt(3);
        System.out.println(stringBuilder.toString());

        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());

        System.out.println(stringBuilder.reverse().toString());

        System.out.println(stringBuilder.length());

        stringBuilder.setLength(11);
        System.out.println(stringBuilder.toString());




        StringBuffer stringBuffer = new StringBuffer();


    }


}
