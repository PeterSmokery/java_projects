//+Написать программу, показывающую последовательность действий для игры “Ханойская башня” //
public class forth_ex {
    public static void main(String[] args) {
        hanoi_game(3, 1, 2, 3);
    }

    static void hanoi_game(int q, int from, int to, int buf) {
        if (q == 0)
            return;
        hanoi_game(q - 1, from, buf, to);
        System.out.printf("%d -> %d\n", from, to);
        hanoi_game(q - 1, buf, to, from);
    }
}
