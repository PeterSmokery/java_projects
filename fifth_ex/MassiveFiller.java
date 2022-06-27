package fifth_ex;

import java.util.Random;
import java.util.Scanner;

public class MassiveFiller {
    public int[] RandomFiller() {
        Random random = new Random();
        System.out.println("введите размер(число) массива для случайной генерации:");
        Scanner in = new Scanner(System.in);
        String k_string = in.next();
        Scanner out = new Scanner(k_string);
        Integer k_int = null;
        if (out.hasNextInt() == true) {
            k_int = Integer.parseInt(k_string);
        } else {
            System.out.println("вы ввели не число или число слишком большое ");
            System.exit(1);
        }
        System.out.println("---------------------");
        int mas[] = new int[k_int];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10) + random.nextInt(10) - random.nextInt(10);
            System.out.println(mas[i]);
        }
        in.close();
        out.close();
        return mas;
    }
}