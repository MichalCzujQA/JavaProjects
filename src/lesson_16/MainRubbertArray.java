package lesson_16;

public class MainRubbertArray {
    public static void main(String[] args) {

        RubberArray re = new RubberArray();

        System.out.println(re.toString());


        re.add(15);
        re.add(-10);
        re.add(100);

        for (int i = 0; i < 1_000_000; i++) {
            re.add(i);
            System.out.println(re.toString());
        }


        re.add(10, 15, 17, -5, 24);
        System.out.println(re.toString());

    }
}
