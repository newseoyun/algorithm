/**
 * 부분집합 구하기(DFS)
 */
public class Rtg06 {

    static int n;  // 원소의 개수
    static int[] ch;  // 체크 배열

    void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i=1; i<=n; i++) {
                if(ch[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        Rtg06 T = new Rtg06();
        n = 3;
        ch = new int[n+1];
        T.DFS(1);
    }
}
