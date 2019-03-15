package baekjoon.basic.datastructure;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 조세퍼스 문제
 */

public class Josephus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> q = new LinkedList<>();
        LinkedList<Integer> answer = new LinkedList<>();
        int n = scanner.nextInt(), m = scanner.nextInt();
        int cnt = 1, tmp;

        for(int i = 1 ; i <= n ; i++)
            q.add(i);

        while(!q.isEmpty()){
            tmp = q.poll();
            if(cnt % m == 0)
                answer.offer(tmp);
            else
                q.offer(tmp);

            if(cnt == q.size())
                cnt = 0;
            cnt++;
        }
        StringBuilder s = new StringBuilder();
        while(!answer.isEmpty()) {
            s.append(answer.poll());
        }
        System.out.println(s.toString());
    }
}
