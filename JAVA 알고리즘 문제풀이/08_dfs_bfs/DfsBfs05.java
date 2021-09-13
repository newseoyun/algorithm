import java.util.Scanner;

/**
 * 동전 교환 DFS

입력
3  (동전 종류 수)
1 2 5  (동전 종류 액면)
15  (값)

출력
3  (거슬러 줄 동전의 최소 개수)

 */
public class DfsBfs05 {
    
    static int n;
    static int m;
    static int answer = Integer.MAX_VALUE;

    void DFS(int L, int sum, int[] arr) {
        if (sum > m || L >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i=0; i<n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        DfsBfs05 T = new DfsBfs05();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = kb.nextInt();
        m = kb.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
