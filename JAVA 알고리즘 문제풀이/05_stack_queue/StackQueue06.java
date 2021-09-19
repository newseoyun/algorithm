import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 공주 구하기 (Queue)
 */
public class StackQueue06 {
    
    int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++) q.offer(i);
        while(!q.isEmpty()) {
            for(int i=1; i<k; i++) {
                q.offer(q.poll());
            }
            q.poll();
            if(q.size() == 1) answer = q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        StackQueue06 T = new StackQueue06();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.solution(n, k));
    }
}
