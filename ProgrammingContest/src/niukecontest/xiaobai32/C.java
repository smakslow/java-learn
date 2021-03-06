package niukecontest.xiaobai32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        int T = nextInt();
        while (T-- > 0) {
            solve(nextInt());
        }

        out.flush();
        out.close();
    }

    private static int solve(int num) {
        int[] dp = new int[num + 1];
        dp[num] = 1;
        for (int i = 0; i <= num; i++) {
            dp[dp[num]] = 1;
        }
        return dp[0];
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(in.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}



