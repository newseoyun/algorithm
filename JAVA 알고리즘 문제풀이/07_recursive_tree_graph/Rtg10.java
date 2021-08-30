import java.util.LinkedList;
import java.util.Queue;

/**
 * Tree 말단 노드까지의 가장 짧은 경로(BFS)
 */
public class Rtg10 {

    Node root;

    int BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int level = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for(int i=0; i<len; i++) {
                Node cur = Q.poll();
                if (cur.lt == null && cur.rt == null) return level;
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
            level++;
        }
        return 0;
    }


    public static void main(String[] args) {
        Rtg10 tree = new Rtg10();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
    
}
