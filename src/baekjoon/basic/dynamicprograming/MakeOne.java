package baekjoon.basic.dynamicprograming;

import java.util.Scanner;

/**
 * 3으로 나누거나 2로 나누거나 1을 빼서 최소한의 계산을 통해서 1로 만들기 문제.
 */
public class MakeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] d = new int[n+1];
        d[1] = 0;

        for(int i=2 ; i<=n ; i++){
            d[i] = d[i-1] + 1;
            if(i % 3 == 0 && d[i] > (d[i/3] + 1)){
                d[i] = d[i/3] + 1;
            }else if(i%2 == 0 && d[i] > (d[i/2] +1)){
                d[i] = d[i/2] + 1;
            }
        }
        System.out.println(d[n]);
    }
}
