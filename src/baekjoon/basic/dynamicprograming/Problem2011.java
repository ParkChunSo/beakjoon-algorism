package baekjoon.basic.dynamicprograming;

import java.util.Scanner;

public class Problem2011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long mod = 1000000L;
        char[] n = scanner.nextLine().toCharArray();
        long[] d = new long[n.length];
        int x = 0, y = 0;

        d[0] = 1L % mod;
        if (n.length > 1 && ((Character.getNumericValue(n[0]) * 10) + Character.getNumericValue(n[1])) <= 26)
            d[1] = 2L % mod;
        else
            d[1] = d[0] % mod;

        for (int i = 2; i < d.length; i++) {
            x = Character.getNumericValue(n[i]);
            y = Character.getNumericValue(n[i-1]);

            if(x != 0)
                d[i] = (d[i - 1]) % mod;

            if (10 <= ((y * 10) + x) && ((y * 10) + x) <= 26)
                d[i] = (d[i - 1] + d[i - 2]) % mod;
        }
        System.out.println(d[d.length - 1]);
    }
}
