package baekjoon.basic.exercise;

import java.util.Scanner;

/**
 * 1부터 n까지의 합 구하기
 */
public class Hab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n*(n+1))/2);
    }
}
