import java.util.ArrayList;
import java.util.Scanner;

/**
 * 경로탐색2 (인접리스트, ArrayList)
 * 
 * 1번에서 N번으로 가는 모든 경로의 가지 수
 */
public class Rtg13 {

    static int n = 0;
    static int m = 0;
    static int answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] checkArray;

    void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int nv : graph.get(v)) {
                if (checkArray[nv] == 0) {
                    checkArray[nv] = 1;
                    DFS(nv);
                    checkArray[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Rtg13 T = new Rtg13();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        checkArray = new int[n+1];
        for (int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        checkArray[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
