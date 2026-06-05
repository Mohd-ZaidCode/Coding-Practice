import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            String s = br.readLine().trim();
            int n = s.length();
            int[][] dp = new int[n + 1][5];
            for (int i = 0; i <= n; i++) {
                Arrays.fill(dp[i], (int) 1e9);
            }            
            dp[0][0] = 0;            
            for (int i = 0; i < n; i++) {
                int digit = s.charAt(i) - '0';
                for (int state = 0; state <= 4; state++) {
                    if (dp[i][state] == (int) 1e9) continue;
                    dp[i + 1][state] = Math.min(dp[i + 1][state], dp[i][state] + 1);
                    int nextState = getNextState(state, digit);
                    if (nextState != -1) {
                        dp[i + 1][nextState] = Math.min(dp[i + 1][nextState], dp[i][state]);
                    }
                }
            }
            
            int ans = (int) 1e9;
            for (int state = 0; state <= 4; state++) {
                ans = Math.min(ans, dp[n][state]);
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
    private static int getNextState(int state, int d) {
        if (d == 4) return -1;
        if (state == 0) {
            if (d == 1 || d == 3) return d;
            return -1;
        }
        if (state == 1) {
            if (d == 1) return 1;
            if (d == 3) return 4;
            return -1;
        }
        if (state == 3) {
            if (d == 1) return 4;
            if (d == 3) return 3;
            return -1;
        }
        if (state == 4) {
            if (d == 1) return 4;
            if (d == 3) return 4;
            return -1;
        }
        return -1;
    }
}