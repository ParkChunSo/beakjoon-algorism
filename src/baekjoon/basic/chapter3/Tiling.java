package baekjoon.basic.chapter3;

import java.util.Scanner;

/**
 * 2*n 타일링 문제
 */

public class Tiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] d = new int[n+1];
        d[1] = 1;
        d[2] = 2;
        for(int i = 3; i <= n ; i++){
            d[i] = d[i-1] + d[i-2];
            d[i] %= 10007;
        }
        System.out.println(d[n]);
    }
}
