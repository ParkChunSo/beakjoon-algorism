package baekjoon.basic.chapter3;

import java.util.Scanner;

public class StairNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] d = new int[n+1][10];
        for(int i = 1; i< 10 ; i++)
            d[1][i] = 1;
        for(int i = 2; i <= n ; i++){
            for(int j = 0 ; j < d[i].length ; j++){
                if(j == 0)
                    d[i][j] = d[i-1][1];
                else if(j == 9)
                    d[i][j] = d[i-1][8];
                else
                    d[i][j] = d[i-1][j-1] + d[i-1][j+1];
            }
        }
        long total = 0;
        for(int i = 0 ; i< 10 ; i++)
            total += d[n][i];
        System.out.println(total%1000000000L);
    }
}
