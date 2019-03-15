package baekjoon.basic.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class StackPipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        Stack stack = new Stack();
        int total = 0;

        for(int i = 0; i< s.length; i++){
            if(s[i] == '(')
                stack.push(s[i]);
            else if(s[i] == ')' && s[i-1] == '('){
                stack.pop();
                total += stack.size();
            }
            else{
                stack.pop();
                total += 1;
            }
        }
        System.out.println(total);
    }
}
