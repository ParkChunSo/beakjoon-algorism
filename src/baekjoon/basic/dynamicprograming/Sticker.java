package baekjoon.basic.dynamicprograming;

import java.util.Scanner;

public class Sticker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] score = new int[n];
        int[][] sticker, d;
        int t;
        for(int m = 0 ; m < n ; m++){
            t = scanner.nextInt();

            sticker = new int[2][t];
            for(int i = 0; i < 2 ; i++) {
                for (int j = 0; j < t; j++)
                    sticker[i][j] = scanner.nextInt();
            }

            d = new int[t][3];
            d[0][0] = 0; d[0][1] = sticker[0][0]; d[0][2] = sticker[1][0];
            for(int i = 1; i < t ; i++){
                d[i][0] = d[i-1][1] > d[i-1][2] ? d[i-1][1] : d[i-1][2];
                d[i][0] = d[i-1][0] > d[i][0] ? d[i-1][0] : d[i][0];

                d[i][1] = (d[i-1][0] > d[i-1][2] ? d[i-1][0] : d[i-1][2]) + sticker[0][i];

                d[i][2] = (d[i-1][0] > d[i-1][1] ? d[i-1][0] : d[i-1][1]) + sticker[1][i];
            }

            score[m] = d[t-1][1] > d[t-1][2] ? d[t-1][1] : d[t-1][2];
            score[m] = d[t-1][0] > score[m] ? d[t-1][0] : score[m];
        }

        for(int i = 0 ; i<score.length ; i++)
            System.out.println(score[i]);
    }
}
