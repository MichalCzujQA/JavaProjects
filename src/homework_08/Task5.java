package homework_08;

public class Task5 {
    public static void main(String[] args) {

        String[] strings = {"One", "Two", "Twenty", "hello", "fdsfsfworld"};

        String longestStr = strings[0];

        int i = 0;
        while (i < strings.length) {
            String currentElement = strings[i];
            if (strings[i].length() > longestStr.length()){
                longestStr = currentElement;

            }
            i++;
        }
        System.out.println("Longest: " + longestStr);

        char[] chars = longestStr.toCharArray();

        int k = 0;
        while (k < chars.length){
            System.out.println(chars[k++]);
        }

        int j = 0;
        while (j< longestStr.length() ){
            System.out.println(longestStr.charAt(j++));
        }


    }
}
