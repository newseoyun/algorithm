import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 그래프 최단거리(BFS)
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
