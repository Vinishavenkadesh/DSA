import java.util.Scanner;

public class ShootingCompetition {
    public static int getMaxPoints(int[] markers) {
        int n = markers.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = markers[i];
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                int left = markers[i] + Math.min((i + 2 <= j) ? dp[i + 2][j] : 0, (i + 1 <= j - 1) ? dp[i + 1][j - 1] : 0);
                int right = markers[j] + Math.min((i <= j - 2) ? dp[i][j - 2] : 0, (i + 1 <= j - 1) ? dp[i + 1][j - 1] : 0);
                dp[i][j] = Math.max(left, right);
            }
        }return dp[0][n - 1];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int[] markers = new int[R];
        for (int i = 0; i < R; i++) {
            markers[i] = scanner.nextInt();
        }
        int maxPoints = getMaxPoints(markers);
        System.out.println(maxPoints);

        scanner.close();
    }
}