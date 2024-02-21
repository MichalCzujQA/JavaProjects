package lesson_19;

public class Main19 {
    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo(15);
        FinalDemo finalDemo1 = new FinalDemo(25);
        finalDemo.printArray();

        finalDemo.setNewValue();
        finalDemo.printArray();

        System.out.println(finalDemo.PI);

        finalDemo.INTS[0] = 150;
        finalDemo.INTS[1] = 200;

        System.out.println(Math.E);
    }
}
