import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 응급실 내풀이
 */
public class StackQueue08 {

    int solution(int n, int c, int[] list) {
        int answer = 1;
        int dp = 1;
        int target = 0;
        Queue<Integer> q = new LinkedList<>();
        
        for (int i=0; i<n; i++) {
            if (i == c) target = list[i] * 100 - dp; 
            q.offer((list[i] == list[c]) ? list[i] * 100 - dp++ : list[i] * 100);
        }
        while(!q.isEmpty()) if (q.poll() > target) answer++;
        return answer;
    }

    public static void main(String[] args) {
        StackQueue08 T = new StackQueue08();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = kb.nextInt();
        int[] list = new int[n];

        for (int i=0; i<n; i++) {
            list[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, c, list));
    }
}

    // 이 문제 이상함. 요구하는 출력은 큐 안쓰고 걍 몇 번 째로 큰 수인지만 계산하면 됨.
    // 응급실 전광판 구현할 때는 큐를 쓰면 되겠지만.

    // 동일한 값일 경우 순위를 주기 위해 100배 뻥튀기 후 1씩 더 차감하는 방식을 썼음.
    // 주어지는 자연수가 <=100 이기 때문에 100배 한 것.
    // ex) 60 60 60 => 5999 5998 5997
