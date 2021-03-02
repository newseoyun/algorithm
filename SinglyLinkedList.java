class Node {
    int data;
    Node next = null;

    Node(int d) {
        this.data = d;
    }

    void append(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d) {
        Node n = this;
        while (n.next != null) {
            if (n.next.data == d ) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = this;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }
}


public class SinglyLinkedList {
    public static void main (String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.retrieve();
        head.delete(2);
        head.append(5);
        head.append(6);
        head.append(7);
        head.retrieve();

        int k = 4;
        // Node kth = KthToLast(head, k);
        // System.out.println("Last k(" + k + ")th data is " + kth.data);
        Node fount = KthToLast(head, k);
        System.out.println(fount.data);
    }


    // // 뒤에서부터 k번째 값 반환
    // private static Node KthToLast(Node first, int k) {
    //     Node n = first;
    //     int total = 1;
    //     while (n.next != null) {
    //         total++;
    //         n = n.next;
    //     }
    //     n = first;
    //     for (int i = 1; i < total - k + 1; i++) {
    //         n = n.next;
    //     }
    //     return n;
    // }



    // // 재귀호출을 이용한 k번째 값 반환    시간: O(n) 공간: O(n)
    // private static int KthToLast(Node n, int k) {
    //     if (n == null) {
    //         return 0;
    //     }

    //     int count = KthToLast(n.next, k) + 1;
    //     if (count == k) {
    //         System.out.println(k + "th to last node is " + n.data);
    //     }
    //     return count;
    // }



    // 포인터를 이용해서 뒤에서부터 k번째 노드 반환    시간: O(n) 공간: O(1)
    private static Node KthToLast(Node first, int k) {
        Node p1 = first;
        Node p2 = first;

        for (int i=0; i<k; i++) {
            if (p1 == null) return null;
            p1 = p1.next;
        }


        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }


}


