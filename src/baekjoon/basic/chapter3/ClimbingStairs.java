package baekjoon.basic.chapter3;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        d[0] = a[0];
        d[1] = d[0] + a[1];
        d[2] = Math.max(a[0] + a[2], a[1] + a[2]);
        for (int i = 3; i < n; i++) {
            d[i] = Math.max((a[i] + a[i - 1] + d[i - 3]), (a[i] + d[i - 2]));
        }
        System.out.println(d[n-1]);
    }
}
