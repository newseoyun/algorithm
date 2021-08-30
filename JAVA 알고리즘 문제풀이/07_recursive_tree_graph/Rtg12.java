import java.util.Scanner;


/**
 * 경로탐색(DFS)
 * 
 * 1번에서 N번으로 가는 모든 경로의 가지 수

    입력
    5 9
    1 2
    1 3
    1 4
    2 1
    2 3
    2 5
    3 4
    4 2
    4 5

    출력
    6
  
 */
public class Rtg12 {

    static int n = 0;
    static int m = 0;
    static int answer = 0;
    static int[][] graph;
    static int[] checkArray;

    void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int i=1; i<=n; i++) {
                if (graph[v][i] == 1 && checkArray[i] == 0) {
                    checkArray[i] = 1;
                    DFS(i);
                    checkArray[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Rtg12 T = new Rtg12();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n+1][n+1];
        checkArray = new int[n+1];
        for (int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        checkArray[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
    
}
