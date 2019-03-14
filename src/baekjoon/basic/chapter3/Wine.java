package baekjoon.basic.chapter3;

import java.util.Scanner;

public class Wine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] wine = new int[n];
        for (int i = 0; i < n; i++)
            wine[i] = scanner.nextInt();

        int[][] d = new int[n][3];
        d[0][0] = 0;
        d[0][1] = wine[0];
        d[0][2] = wine[0];

        for (int i = 1; i < n; i++) {
            d[i][0] = Math.max(d[i - 1][0], Math.max(d[i - 1][1], d[i - 1][2]));
            d[i][1] = d[i - 1][0] + wine[i];
            d[i][2] = d[i - 1][1] + wine[i];
        }
        int answer = Math.max(d[n - 1][0], Math.max(d[n - 1][1], d[n - 1][2]));
        System.out.println(answer);
    }
}
