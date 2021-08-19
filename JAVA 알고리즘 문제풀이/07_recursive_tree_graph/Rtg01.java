/**
 * 재귀함수(스택프레임)
 */
public class Rtg01 {

    void solution(int n) {
        if (n == 0) return;

        System.out.println("n: " + n); // 3 2 1
        solution(n-1);
        System.out.println("n: " + n); // 1 2 3 
    }

    public static void main(String[] args) {
        Rtg01 T = new Rtg01();
        T.solution(3);
    }
}
