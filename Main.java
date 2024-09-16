import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
// задание 1
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число a в диапазоне от -2,147,483,648 до 2,147,483,647");
        a = scan.nextInt();
        System.out.println("Введите число b в диапазоне от -2,147,483,648 до 2,147,483,647");
        b = scan.nextInt();
        Numbers num = new Numbers();
        num.setNumbers(a, b);
        num.getComparison();
        num.getMathematicalOperations();
// задание 2
        Scanner scanStr = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String s1 = scanStr.nextLine();
        System.out.println("Введите вторую строку");
        String s2 = scanStr.nextLine();
        StringComparison str = new StringComparison();
        str.setStr(s1, s2);
        str.getComparison();
// задание 3
        EvenNumbers arr = new EvenNumbers();
        arr.getEvenNumbers();


    }
}














