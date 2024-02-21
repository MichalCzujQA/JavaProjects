package lesson_19;

public class FinalDemo {

    public static final double PI = 3.141519; // are constant

    public static final int[] INTS = new int[10]; // not  a constant

    {
        INTS[1] =(int) PI;
    }

    private final int x;

    private int[] ints;

    public FinalDemo(int x) {
        this.x = x;
        ints = new int[10];
    }

    public int getX() {
        return x;
    }

    public void setX(int newValue) {
        //  this.x = newValue;
    }

    public void setNewSize(int size) {
        //  ints = new int[size];
    }

    public void setNewValue() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i * 10;
        }
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length - 1) ? ", " : "]\n"));
        }
    }
}
