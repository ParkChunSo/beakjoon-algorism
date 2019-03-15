package baekjoon.basic.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class Editer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] chars = scanner.nextLine().toCharArray();
        int cnt = scanner.nextInt();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(char c : chars)
            stack1.push(c);

        char c;
        while(cnt-- > 0){
            c= scanner.next().charAt(0);
            switch (c){
                case 'L':
                    if(!stack1.empty())
                        stack2.push(stack1.pop());
                    break;
                case 'D':
                    if(!stack2.empty())
                        stack1.push(stack2.pop());
                    break;
                case 'B':
                    if(!stack1.empty())
                        stack1.pop();
                    break;
                case 'P':
                    stack1.push(scanner.next().charAt(0));
                    break;
            }
        }
        while(!stack1.empty())
            stack2.push(stack1.pop());
        StringBuilder sb = new StringBuilder();
        while (!stack2.empty()) {
            sb.append(stack2.pop());
        }
        System.out.println(sb);
    }
}
