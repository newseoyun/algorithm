import java.util.Scanner;

/**
 * 중복순열

입력
3 2

출력
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3

 */
public class DfsBfs04 {

    static int[] pm;
    static int n;
    static int m;

    void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i=1; i<=n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        DfsBfs04 T = new DfsBfs04();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
    
}
