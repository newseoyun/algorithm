import java.util.*;

/**
 * 친구인가(Disjoint-Set: Union&Find)
 */
class Greedy06 {
    static int[] unionAndFind;

    public static int Find(int v) {
        if (v == unionAndFind[v]) return v;
        else return unionAndFind[v] = Find(unionAndFind[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unionAndFind[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unionAndFind = new int[n + 1];

        for(int i=1; i<=n; i++) unionAndFind[i] = i;

        for(int i=1; i<=m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            Union(a, b);
        }

        int a = kb.nextInt();
        int b = kb.nextInt();
        int fa = Find(a);
        int fb = Find(b);
        
        if (fa == fb) System.out.println("YES");
        else System.out.println("NO");		
    }
}
