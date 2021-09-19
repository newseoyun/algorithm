import java.util.Scanner;

/**
 * 연속된 k일의 합이 최대 매출인 그 합 구하기
 */
class SlidingWindow03 {

    int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i=k; i<n; i++) {
            sum += arr[i] - arr[i-k];
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        SlidingWindow03 T = new SlidingWindow03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}
