/**
 * 피보나치 재귀(메모이제이션)
 * n번째 항 출력
 */
public class Rtg04 {
    static int[] fibo;
    
    int solution(int n) {
        
        if (fibo[n] > 0) return fibo[n]; 
        if(n == 1 || n == 2) return fibo[n] = 1;
        return fibo[n] = solution(n-2) + solution(n-1);
    }

    public static void main(String[] args) {
        Rtg04 T = new Rtg04();
        int n = 45;
        fibo = new int[n+1];
        //System.out.println(T.solution(n));
        T.solution(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
    }
}
