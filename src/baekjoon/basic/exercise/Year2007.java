package baekjoon.basic.exercise;

import java.util.Scanner;

/**
 * 월 일의 따라 요일 맞추기
 */
public class Year2007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m , d, totalOfDay;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        m = scanner.nextInt(); d = scanner.nextInt(); totalOfDay = 0;
        for(int i = 0 ; i < m-1 ; i++)
            totalOfDay += days[i];

        totalOfDay += d;
        System.out.println(week[totalOfDay%7]);

    }
}
