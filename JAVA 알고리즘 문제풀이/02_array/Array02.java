import java.util.Scanner;

/**
 * 보이는 학생수: Max 비교
 */
public class Array02 {

    public int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];

        for(int i=1; i<n; i++) {
            if(arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Array02 T = new Array02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
    
}
