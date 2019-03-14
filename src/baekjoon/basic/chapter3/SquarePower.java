package baekjoon.basic.chapter3;

import java.util.Scanner;

public class SquarePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 2;
        int[] d = new int[n+1];

        d[0] = 0; d[1] = 1; d[2] = 2;
        for(int i = 3 ; i<= n ; i++){
            if(i >= index * index){
                d[i] = d[i - (index+index)];
                index++;
            }else{
                for(int j = )
            }
        }
    }
}
/*
20 = 4 + 2
19 = 4 + 1 + 1 + 1
 */