
/**
 * 이진수 출력(재귀)
 */
public class Rtg02 {
    
    void DFS(int n) {
        if (n == 0) return;
        DFS(n/2);
        System.out.print(n%2);
    }

    public static void main(String[] args) {
        Rtg02 T = new Rtg02();
        T.DFS(11);
    }
}
