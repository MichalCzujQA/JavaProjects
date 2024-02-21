package homework_05;

public class Task1 {
    public static void main(String[] args) {

        String name = "Sergey";

        int nameLength = name.length();

        System.out.println("Length of name " + nameLength );

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length()-1);

        System.out.println("First char " + firstChar);
        System.out.println("Last char " + lastChar);

    }
}
