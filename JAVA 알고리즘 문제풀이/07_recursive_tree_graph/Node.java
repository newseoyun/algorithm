public class Node {
    int data;
    Node lt; // 인스턴스 변수. Node 클래스의 객체 주소를 저장함.
    Node rt; // 인스턴스 변수. Node 클래스의 객체 주소를 저장함.

    Node(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}
