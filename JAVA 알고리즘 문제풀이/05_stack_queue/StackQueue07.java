import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 교육과정설계
 */
public class StackQueue07 {
    
    String solution(String key, String str) {
        Queue<Character> q = new LinkedList<>();

        for(char x : key.toCharArray()) q.offer(x);
        for(char s : str.toCharArray()) {
            if(q.isEmpty()) return "YES";
            if(s == q.peek()) q.poll(); 
        }
        return "NO";
    }

    public static void main(String[] args) {
        StackQueue07 T = new StackQueue07();
        Scanner kb = new Scanner(System.in);
        String key = kb.next();
        String str = kb.next();
        System.out.println(T.solution(key, str));
    }
}
