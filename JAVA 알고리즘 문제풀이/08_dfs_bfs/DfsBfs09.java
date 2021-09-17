import java.util.Scanner;

/**
 * 조합구하기

입력
4 2

출력
1 2
1 3
1 4
2 3
2 4
3 4

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
