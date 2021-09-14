import java.util.Scanner;

/**
 * 순열 구하기
 * 
입력 (숫자 3개. 2열)
3 2
3 6 9

출력
3 6
3 9
6 3
6 9
9 3
9 6

 */
public class DfsBfs06 {

    static int[] pm;
    static int[] ch;
    static int[] arr;
    static int n;
    static int m;

    void DFS(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i=0; i<n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        DfsBfs06 T = new DfsBfs06();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = kb.nextInt();
        ch = new int[n];
        pm = new int[m];
        T.DFS(0);
    }
}
