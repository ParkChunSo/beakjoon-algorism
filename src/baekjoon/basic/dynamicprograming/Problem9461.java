package baekjoon.basic.dynamicprograming;

import java.util.Scanner;

public class Problem9461 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        long[] ans = new long[count];

        for(int i = 0 ; i< count ; i++) {
            int n = scanner.nextInt();
            long[] d = new long[n];
            d[0] = 1;
            d[1] = 1;
            d[2] = 1;
            d[3] = 2;
            d[4] = 2;
            for (int j = 5; j < n; j++) {
                d[j] = d[j - 1] + d[j - 5];
            }
            ans[i] = d[n-1];
        }

        for (long n : ans) {
            System.out.println(n);
        }
    }
}
