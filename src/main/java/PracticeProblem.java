import java.util.ArrayList;

public class PracticeProblem {

    public static void main(String[] args) {
        String[] result = towerOfHanoi(3);
        for (String move : result) {
            System.out.println(move);
        }
    }

    public static String[] towerOfHanoi(int n) {
        if (n <= 0) return new String[0];
        ArrayList<String> moves = new ArrayList<>();
        solve(n, 'L', 'M', 'R', moves);
        return moves.toArray(new String[0]);
    }

    private static void solve(int n, char from, char aux, char to, ArrayList<String> moves) {
        if (n == 1) {
            moves.add("" + from + to);
            return;
        }
        solve(n - 1, from, to, aux, moves);
        moves.add("" + from + to);
        solve(n - 1, aux, from, to, moves);
    }
}
