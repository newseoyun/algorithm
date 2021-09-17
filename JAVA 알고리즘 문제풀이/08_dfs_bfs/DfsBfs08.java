import java.util.Scanner;
/**
 * 수열 추측하기

입력 (numCnt, finalNum)
4 16

출력 (제일 상위 숫자들)
3 1 2 4

*/
public class DfsBfs08 {    

    static int[] b;
    static int[] p;
    static int[] checkArray;
    static int numCnt;
    static int finalNum;
    boolean flag = false;
    int[][] memoization = new int[35][35];

    int combination(int n, int r) { // 조합수
        if (memoization[n][r] > 0) return memoization[n][r];
        if (n == r || r == 0) return 1;
        else return memoization[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }

    void DFS(int L, int sum) {
        if (flag) return;
        if (L == numCnt) {
            if (sum == finalNum) {
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            for (int i=1; i<=numCnt; i++) {
                if (checkArray[i] == 0) {
                    checkArray[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L]*b[L]));
                    checkArray[i] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        DfsBfs08 T = new DfsBfs08();
        Scanner kb = new Scanner(System.in);
        numCnt = kb.nextInt();
        finalNum = kb.nextInt();
        b = new int[numCnt];
        p = new int[numCnt];
        checkArray = new int[numCnt+1];
        
        for (int i=0; i<numCnt; i++) {
            b[i] = T.combination(numCnt - 1, i);
        }
        T.DFS(0, 0);
    }
}
