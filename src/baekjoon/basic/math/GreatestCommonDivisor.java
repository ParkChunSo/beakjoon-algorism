package baekjoon.basic.math;

public class GreatestCommonDivisor {
    /*
        최대공약수 구하기(유클리드 알고리즘)
        GCD(a,b,c) = GCD(a, GCD(b, c))
     */
    public int gcd(int a, int b){
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }
    
}
