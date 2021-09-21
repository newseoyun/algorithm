import java.util.Scanner;

/**
 * 피보나치 수열
 */
public class Array04 {

    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        
        for (int i=2; i<n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }

    public void solution2(int n) {
        int a = 1;
        int b = 1;
        int c;
        
        for (int i=2; i<n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Array04 T = new Array04();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        
        for (int x : T.solution(n)) System.out.print(x + " ");
        System.out.println("");
        T.solution2(n);
    }
}
