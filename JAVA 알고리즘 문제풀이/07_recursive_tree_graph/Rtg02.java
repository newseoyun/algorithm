/**
 * 이진수 출력(재귀)
 */
public class Rtg02 {
    
    void solution(int n) {
        if (n == 0) return;
        solution(n/2);
        System.out.print(n%2);
    }

    public static void main(String[] args) {
        Rtg02 T = new Rtg02();
        T.solution(11);
    }
}
