import java.util.Scanner;

/**
 * 조합 구하기
 */
public class DfsBfs09 {
    
    static int[] combination;
    static int n;
    static int m;

    void DFS(int L, int s) {
        if(L == m) {
            for (int x : combination) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i=s; i<=n; i++) {
                combination[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        DfsBfs09 T = new DfsBfs09();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combination = new int[m];
        T.DFS(0, 1);
    }
}
