
/*+На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
- команда 1 (к1): увеличить в с раза, а умножается на c
- команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
Пример 1: а = 1, b = 7, c = 2, d = 1
ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1. 
Пример 2: а = 11, b = 7, c = 2, d = 1
ответ: нет решения. 
*Подумать над тем, как сделать минимальное количество команд */
//решение самым быстрым способом!основано на использовании наиболее "сильного" шага,то есть умножения
import java.util.Scanner;
import java.util.InputMismatchException;

public class third_ex {

    public static void main(String[] args) throws InputMismatchException {
        try {
            int a = get_number();
            int b = get_number();
            int c = 2;// по условию k1 находится внутри исполнителя
            int d = 3;// по условию k2 находится внутри исполнителя
            String answer = "Ответ: ";
            if (a > b) {
                System.out.println("Нет решения");
            }
            while (a < b) {
                a = a * c;
                if (a <= b) {
                    answer += "k1";
                    if (a < b)
                        answer += ", ";
                    else
                        answer += ".";
                }
                if (a > b) {
                    a = a / c;
                    a = a + d;
                    answer += "k2";
                    if (a < b)
                        answer += ", ";
                    else
                        answer += ".";
                }
            }
            if (a == b) {
                System.out.println(answer);
            } else {
                System.out.println("нет решения");
            }
        } catch (InputMismatchException e) {
            System.out.println("это не число или число слишком велико");
        }
    }

    static int get_number() {

        Scanner search = new Scanner(System.in);
        System.out.print("введите число: ");
        int num = search.nextInt();
        return num;

    }
}