import java.util.*;

/**
 * 다익스트라 알고리즘
 */

class Edge implements Comparable<Edge> {
    public int vertex;
    public int cost;

    Edge(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }
    
    @Override
    public int compareTo(Edge ob) {
        return this.cost - ob.cost;
    }
}

class Main {
    static int n;
    static int m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    public void solution(int v) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0));
        dis[v] = 0;

        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int now = tmp.vertex;
            int nowCost = tmp.cost;

            if (nowCost > dis[now]) continue;

            for (Edge ob : graph.get(now)) {
                if (dis[ob.vertex] > nowCost + ob.cost) {
                    dis[ob.vertex] = nowCost + ob.cost;
                    pQ.offer(new Edge(ob.vertex, nowCost + ob.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        
        graph = new ArrayList<ArrayList<Edge>>();

        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Edge>());
        }

        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        
        for (int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        T.solution(1);
        
        for (int i=2; i<=n; i++) {
            if (dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
            else System.out.println(i + " : impossible");
        }
    }
}
