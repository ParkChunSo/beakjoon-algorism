package baekjoon.basic.chapter3;

import java.util.Scanner;

/**
 * 정수 n을 1,2,3의 조합으로 나타내는 방법의 수를 구하는 문제
 */
public class Plus123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();

        int[] n = new int[cnt];
        for(int i = 0 ; i< cnt ; i++)
            n[i] = scanner.nextInt();
        for(int i = 0 ; i< cnt ; i++) {
            int[] d = new int[n[i] + 1];
            d[1] = 1;
            d[2] = 2;
            d[3] = 4;

            for (int j = 4; j <= n[i]; j++) {
                d[j] = d[j - 1] + d[j - 2] + d[j - 3];
            }
            System.out.println(d[n[i]]);
        }
    }
}
