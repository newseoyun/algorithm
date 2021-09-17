
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
    boolean isUsed = false;
    int[][] memoization = new int[35][35];

    int combination(int n, int r) { // 조합수
        if (memoization[n][r] > 0) return memoization[n][r];
        if (n == r || r == 0) return 1;
        else return memoization[n][r] = combination(n-1, r-1) + combination(n-1, r);
    }


    
    public static void main(String[] args) {
    
        DfsBfs08 T = new DfsBfs08();
        Scanner kb = new Scanner(System.in);
        numCnt = kb.nextInt();
        finalNum = kb.nextInt();
        b = new int[n];
        p = new int[n];
        checkArray = new int[n+1];
        
        for (int i=0; i<n; i++) {
            b[i] = T.combination(n-1, i);
        }
        T.DFS(0, 0);
    }
}
