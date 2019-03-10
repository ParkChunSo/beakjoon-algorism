package baekjoon.basic.chapter3;

import java.util.Scanner;

/**
 * 이친수 구하기
 * --long 타입 주의--
 */
public class PinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] d = new long[n + 1];
        d[1] = 1;
        if(n > 1)
            d[2] = 1;
        for (int i = 3; i <= n; i++)
            d[i] = d[i - 1] + d[i - 2];
        System.out.println(d[n]);
    }
}