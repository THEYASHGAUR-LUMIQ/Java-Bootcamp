import java.util.Scanner;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        // Base cases
        if (i >= game.length) return true;  // Reached the end
        if (i < 0 || game[i] == 1) return false;  // Out of bounds or hit a 1

        game[i] = 1;  // Mark as visited

        // Recursive checks for forward, backward, and leap
        return isSolvable(leap, game, i + leap) || 
               isSolvable(leap, game, i + 1) || 
               isSolvable(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
