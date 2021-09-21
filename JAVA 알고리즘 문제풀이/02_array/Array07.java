import java.util.Scanner;

/**
 * 점수계산 (콤보)
 */
public class Array07 {

    public int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;

        for (int i=0; i<n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer+=cnt;
            }
            else cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Array07 T = new Array07();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
