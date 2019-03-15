package baekjoon.basic.exercise;

import java.util.Scanner;

/**
 * 구구단
 */

public class Gogodan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0, dan = scanner.nextInt();

        while(i++ < 9)
            System.out.println(dan + " * "+ i +" = " + dan*i);
    }
}
