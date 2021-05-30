package acwing.weeklycontest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class A {
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = new StringTokenizer("");

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = nextInt();
            arr[i] = x;
            set.add(x);
        }
        int m = nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            int x = nextInt();
            arr1[i] = x;
            set.add(x);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!set.contains(arr[i] + arr1[j]) ){
                    System.out.println(arr[i] + arr1[j]);
                    return;
                }
            }
        }
        out.flush();
        out.close();
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
