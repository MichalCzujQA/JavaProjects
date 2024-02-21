package homework_08;

public class task0 {
    public static void main(String[] args) {
        int number = 10;
        String result;

        if (number >= 0) {
            result = "Positive";
        } else {
            result = "Negative";
        }

        result = (number >= 10) ? "Positive" : "Negative";

        System.out.println("Our number " + result);


    }
}
