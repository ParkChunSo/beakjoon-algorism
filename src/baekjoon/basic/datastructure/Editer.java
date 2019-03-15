package baekjoon.basic.datastructure;

import java.util.LinkedList;
import java.util.Scanner;
/**
 * 간단한 에디터 만들기( 시간초과 )
 */
public class Editer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        LinkedList<Character> list = new LinkedList();
        for (char c : chars) {
            list.add(c);
        }
        int cnt = scanner.nextInt(), index = list.size();
        char c;
        while(cnt-- > 0){
            c = scanner.next().charAt(0);
            switch (c){
                case 'L':
                    if(index > 0)
                        index--;
                    break;
                case 'D':
                    if(index < list.size())
                        index++;
                    break;
                case 'B':
                    if(index > 0)
                        list.remove(index-1);
                    break;
                case 'P':
                    c = scanner.next().charAt(0);
                    list.add(index, c);
                    break;
            }
        }

        System.out.println(list.toString());
    }
}
