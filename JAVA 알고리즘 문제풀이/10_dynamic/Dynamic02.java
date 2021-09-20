import java.util.*;

/**
 * 돌다리 건너기
 */
class Dynamic02 {
    static int[] dy;

    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        
        for(int i=3; i<=n+1; i++) dy[i] = dy[i - 2] + dy[i - 1];
        return dy[n + 1];
    }

    public static void main(String[] args) {
        Dynamic02 T = new Dynamic02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy = new int[n + 2];
        System.out.print(T.solution(n));
    }
}
