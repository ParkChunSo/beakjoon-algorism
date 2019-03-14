package baekjoon.basic.chapter3;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] d = new int[n];

        for(int i = 0 ; i< n ; i++)
            a[i] = sc.nextInt();

        d[0] = 1;
        for(int i = 1 ; i< n ; i++){
            for(int j = i-1 ; j >=0 ; j--){
                if(a[i] > a[j] && d[i] < d[j])
                    d[i] = d[j];
            }
            d[i] += 1;
        }
        int ans = 0;
        for(int i = 0 ; i< n ; i++)
            if(ans < d[i])
                ans = d[i];
        System.out.println(ans);
    }
}
