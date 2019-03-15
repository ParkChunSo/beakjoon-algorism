package baekjoon.basic.dynamicprograming;

import java.util.Scanner;

/**
 * 오르막 개수 구하기
 */
public class Ascent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long mod = 10007L;
        int n = scanner.nextInt();
        long[][] d = new long[n+1][10];
        for(int i = 0 ; i < 10 ; i++)
            d[1][i] = 1;

        for(int i = 2 ; i<= n; i++){
            for(int j = 0 ; j < 10 ; j++){
                for(int k = 0 ; k <= j ; k++) {
                    d[i][j] += d[i - 1][k];
                    d[i][j] %= mod;
                }
            }
        }
        long answer = 0;
        for(int i = 0 ; i< 10 ; i++)
            answer += d[n][i];
        answer %= mod;
        System.out.println(answer);
    }
}
