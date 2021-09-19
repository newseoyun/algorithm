import java.util.Scanner;

/**
 * 소수의 개수: 에라토스테네스 체
 * (소수: 1보다 큰 자연수 중 1과 자기자신만을 약수로 가지는 수)
 */
public class Array05 {

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];

        for(int i=2; i<=n; i++) {
            if (ch[i] == 0) {
                answer++;
                System.out.println(">>> "  + i);
            }

            for(int j=1; (j*i)<n; j++) {
                ch[i * j] = 1;
            }

            //for(int j=i; j<=n; j=j+i) ch[j]=1; 
            //이건 강의 답안인데 이렇게 하면 소수가 입력값일 때 자기가 1로 체크되므로 틀림.

        }
        return answer;
    }

    public static void main(String[] args) {
        Array05 T = new Array05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
