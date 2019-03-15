package baekjoon.basic.exercise;

import java.util.Scanner;

/**
 * N번 찍기 역순
 */
public class NPrint2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t > 0){
            System.out.println(t);
            t--;
        }
    }
}
