import java.util.LinkedList;
import java.util.Queue;

/**
 * 이진트리 레벨탐색(BFS: Breadth-First Search)
 * 너비 우선 탐색. 레벨 탐색
 * 루트에서 한 번 만에 가는 것 탐색, 두 번 만에 가는 것 탐색 ...
 */
public class Rtg07 {

    Node root;

    void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);

        int lvl= 0;

        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(lvl+ " : ");
        
            for (int i=0; i<len; i++) {
                Node current = Q.poll();
                System.out.print(current.data + " ");

                if (current.lt != null) Q.offer(current.lt);
                if (current.rt != null) Q.offer(current.rt);
            }
            lvl++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rtg07 tree = new Rtg07();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}
