package baekjoon.basic.chapter1;

import java.util.Scanner;

/**
 * 최대값 최소값 구하기.
 */
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), max, min;
        int[] num = new int[n];
        num[0] = scanner.nextInt();
        max = num[0]; min = num[0];
        for(int i = 1 ; i<n ; i++) {
            num[i] = scanner.nextInt();
            if(num[i] > max)
                max = num[i];
            if(num[i] < min)
                min = num[i];
        }
        System.out.println(min+" "+max);
    }
}
