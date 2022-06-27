package six_ex;
//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

public class ferzi {
    private int Size_of_board;
    private int board[][];
    private int results_count = 0;

    public ferzi(int N) {
        Size_of_board = N;
        board = new int[N][N];
        results_count = 0;
    }

    public void setQueen(int a) {
        if (a == Size_of_board) {
            ++results_count;
            System.out.print("Результат #" + results_count + '\n');
            showBoard();
            return;
        }
        for (int i = 0; i < Size_of_board; ++i) {
            if (tryQueen(a, i)) {
                board[a][i] = 1;
                setQueen(a + 1);
                board[a][i] = 0;
            }
        }

        return;
    }

    public boolean tryQueen(int a, int b) {
        for (int i = 0; i < a; ++i)
            if (board[i][b] == 1)
                return false;

        for (int i = 1; i <= a && b - i >= 0; ++i)
            if (board[a - i][b - i] == 1)
                return false;

        for (int i = 1; i <= a && b + i < Size_of_board; i++)
            if (board[a - i][b + i] == 1)
                return false;

        return true;
    }

    public void showBoard() {
        for (int a = 0; a < Size_of_board; ++a) {
            for (int b = 0; b < Size_of_board; ++b) {
                System.out.print((board[a][b] == 1) ? "Q " : ". ");
            }
            System.out.print('\n');
        }
    }
}