package baekjoon.basic.chapter1;

import java.util.Scanner;
/**
 *  A+B 두번째 문제
 */

public class InputOutput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t, a, b;

        t = scanner.nextInt();
        while(scanner.hasNextInt()){
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a+b);
        }
    }
}
