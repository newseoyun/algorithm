/**
 * 팩토리얼
 */
public class Rtg03 {
    
    int solution(int n) {
        if (n == 1) return 1;
        return n*solution(n-1);
    }

    public static void main(String[] args) {
        Rtg03 T = new Rtg03();
        System.out.println(T.solution(5));
    }
}
