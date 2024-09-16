import java.lang.reflect.Array;

public class EvenNumbers {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void getEvenNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }

}
