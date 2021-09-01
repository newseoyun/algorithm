import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 그래프 최단거리(BFS)
 * 
 * 1번 정점에서 각 정점으로 가는 최소 이동 간선 수

(입력 그래프)
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5

(출력)
2: 3
3: 1
4: 1
5: 2
6: 2
 */
public class Rtg14 {
    
    static int n = 0;
    static int m = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] checkArray;
    static int[] distance;

    void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        checkArray[v] = 1;
        distance[v] = 0;
        queue.offer(v);
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int nv : graph.get(current)) {
                if (checkArray[nv] == 0) {
                    checkArray[nv] = 1;
                    queue.offer(nv);
                    distance[nv] = distance[current] + 1;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Rtg14 T = new Rtg14();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        checkArray = new int[n+1];
        distance = new int[n+1];
        for (int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i=2; i<=n; i++) {
            System.out.println(i + ": " + distance[i]);
        }
    }
}
