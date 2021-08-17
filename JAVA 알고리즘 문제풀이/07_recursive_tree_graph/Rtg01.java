/**
 * 재귀함수(스택프레임)
 */
public class Rtg01 {

    void DFS(int n) {
        if (n == 0) return;
        
        System.out.println("n: " + n);
        DFS(n-1);
    }

    public static void main(String[] args) {
        Rtg01 T = new Rtg01();
        T.DFS(3);
    }
}
