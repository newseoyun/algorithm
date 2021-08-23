
/**
 * 이진트리순회(DFS: Depth First Search)
 * 전위순회(부모-왼-오), 중위순회(왼-부모-오), 후위순회(왼-오-부모)
 */
public class Rtg05 {
    
    Node root;
  
    void DFS(Node root) {
        if(root == null) return;

        //System.out.print(root.data + " "); // 전위순회
        DFS(root.lt);
        //System.out.print(root.data + " "); // 중위순회
        DFS(root.rt);
        System.out.print(root.data + " "); // 후위순회
    }

    
    public static void main(String[] args) {
        Rtg05 tree = new Rtg05();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}

class Node {
    int data;
    Node lt, rt; // 인스턴스 변수. Node 클래스의 객체 주소를 저장함.

    Node(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}
