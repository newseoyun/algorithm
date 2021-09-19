import java.util.*;

/**
 * 원더랜드(최소 스패닝 트리: 크루스칼, Union&Find)
 */

class Edge07 implements Comparable<Edge07> {
    public int vertex1;
    public int vertex2;
    public int cost;

    Edge07(int vertex1, int vertex2, int cost) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge07 ob) {
        return this.cost - ob.cost;
    }
}

class Greedy07 {
    static int[] unf;

    public static int Find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);

        if (fa != fb) unf[fa] = fb;
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unf = new int[n + 1];
        ArrayList<Edge07> arr = new ArrayList<>();

        for (int i=1; i<=n; i++) unf[i] = i;

        for (int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            arr.add(new Edge07(a, b, c));
        }
        int answer = 0;
        Collections.sort(arr);

        for (Edge07 ob : arr) {
            int fvertex1 = Find(ob.vertex1);
            int fvertex2 = Find(ob.vertex2);

            if (fvertex1 != fvertex2) {
                answer += ob.cost;
                Union(ob.vertex1, ob.vertex2);
            }
        }
        System.out.println(answer);
    }
}
