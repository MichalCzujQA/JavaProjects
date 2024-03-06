package lesson_35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generate {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4));

        for (int i = 0; i < 10; i++) {
            Collections.shuffle(numbers);
        }


        System.out.println(numbers);
    }
}
