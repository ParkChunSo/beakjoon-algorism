package baekjoon.basic.exercise;

import java.util.Scanner;

/**
 * N번 찍기 문제
 */

public class NPrint1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i =0, t = scanner.nextInt();
        while(i++ < t)
            System.out.println(i);

    }
}
