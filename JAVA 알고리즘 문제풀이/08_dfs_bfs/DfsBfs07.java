import java.util.Scanner;

/**
 * 조합수(메모이제이션)

 입력
5 3

출력
10

 */
public class DfsBfs07 {

    int[][] dy = new int[35][35];

    int DFS(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }

    public static void main(String[] args) {
        DfsBfs07 T = new DfsBfs07();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.DFS(n,r));
    }
}
