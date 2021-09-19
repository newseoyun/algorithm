import java.util.*;

/**
 * 원더랜드(최소 스패닝 트리: 프림, 우선순위큐)
 */

class Edge08 implements Comparable<Edge08> {
    public int vertex;
	public int cost;

    Edge08(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge08 ob) {
        return this.cost - ob.cost;
    }
}

class Greedy08 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		ArrayList<ArrayList<Edge08>> graph = new ArrayList<ArrayList<Edge08>>();

		for (int i=0; i<=n; i++) {
			graph.add(new ArrayList<Edge08>());
		}
		int[] ch=new int[n + 1];

		for (int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge08(b, c));
			graph.get(b).add(new Edge08(a, c));
		}
		int answer = 0;
		PriorityQueue<Edge08> pQ = new PriorityQueue<>();
		pQ.offer(new Edge08(1, 0));

		while (!pQ.isEmpty()) {
			Edge08 tmp = pQ.poll();
			int ev = tmp.vertex;

			if (ch[ev] == 0) {
				ch[ev] = 1;
				answer += tmp.cost;

				for (Edge08 ob : graph.get(ev)) {
					if (ch[ob.vertex] == 0) pQ.offer(new Edge08(ob.vertex, ob.cost));
				}
			}
		}
		System.out.println(answer);
	}
}
