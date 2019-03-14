package baekjoon.basic.chapter3;

import java.util.Scanner;

public class Wine2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] wine = new int[n];
        for (int i = 0; i < n; i++)
            wine[i] = scanner.nextInt();

        int[] d = new int[n];
        d[0] = wine[0];
        if(n > 1) {
            d[1] = wine[0] + wine[1];
            d[2] = Math.max(d[1], d[0] + wine[2]);
        }
        for(int i = 3 ; i<n; i++)
            d[i] = Math.max(d[i-1], Math.max(d[i-2] + wine[i], d[i-3] + wine[i-1] + wine[i]));

        System.out.println(d[n-1]);
    }
}
