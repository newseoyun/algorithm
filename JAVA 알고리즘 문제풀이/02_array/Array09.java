import java.util.Scanner;

/**
 * 격자판 최대합 (빙고 라인별 합 중 가장 큰 값 출력)
 */
public class Array09 {
    
    int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1;
        int sum2;

        for(int i=0; i<n; i++) {
            sum1 = 0;
            sum2 = 0;
            for(int j=0; j<n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        // 대각선 X
        sum1 = 0;
        sum2 = 0;
        for(int i=0; i<n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Array09 T = new Array09();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
