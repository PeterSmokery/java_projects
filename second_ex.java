import java.util.InputMismatchException;
import java.util.Scanner;

public class second_ex {
    public static void main(String[] args) throws InputMismatchException {
        System.out.println("Введите натуральное число для n-треугольного числа: ");
        Scanner in = new Scanner(System.in);
        Long n = null;
        try {
            n = in.nextLong();
        } catch (InputMismatchException e) {
            System.out.println("это не натуральное число");
            System.exit(1);
        }
        if (n > Integer.MAX_VALUE) {
            System.out.println("значение велико для быстрого вычисления");
            System.exit(1);
        }
        if (n == 0) {
            System.out.println("нуль не натуральное число ");
            System.exit(1);
        }
        if (n < 0) {
            System.out.println("число отрицательное");
            System.exit(1);

        }
        long tringleNumber = triangular_number_counter(n);
        String res = "Для треугольного числа с основанием " + n + " значение будет равно: " + tringleNumber;
        System.out.println(res);
        in.close();

    }

    static long triangular_number_counter(long a) {
        long tringle_number = 0;
        for (int i = 0; i != a + 1; i++) {
            tringle_number = tringle_number + i;
        }
        return tringle_number;
    }
}