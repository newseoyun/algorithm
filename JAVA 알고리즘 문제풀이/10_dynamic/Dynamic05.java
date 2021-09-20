import java.util.*;

/**
 * 동전 교환(Knapsack Algorithm)
 */

class Dynamic05 {
    static int n;
    static int m;
    static int[] dy;

    public int solution(int[] coin) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        for (int i=0; i<n; i++) {
            for (int j=coin[i]; j<=m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Dynamic05 T = new Dynamic05();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        
        for (int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        m = kb.nextInt();
        dy = new int[m + 1];
        System.out.print(T.solution(arr));
    }
}
