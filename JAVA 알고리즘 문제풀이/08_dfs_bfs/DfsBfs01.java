import java.util.Scanner;

/**
 * 합이 같은 부분집합
 */
public class DfsBfs01 {
    static String answer = "NO";
    static int n = 0;
    static int total = 0;
    boolean flag = false;

    void DFS(int L, int sum, int[] arr) {
        if ( flag || sum > total / 2 ) return;

        if (L == n) {
            if ( (total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        DfsBfs01 T = new DfsBfs01();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        
        for (int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
