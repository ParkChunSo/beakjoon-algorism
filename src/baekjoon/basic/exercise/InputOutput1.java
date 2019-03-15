package baekjoon.basic.exercise;

import java.util.Scanner;

/**
 *  A+B 첫번째 문제
 */
public class InputOutput1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a+b);
    }
}
