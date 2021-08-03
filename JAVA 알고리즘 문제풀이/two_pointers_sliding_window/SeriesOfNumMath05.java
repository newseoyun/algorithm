

/**
 * 연속된 자연수의 합: 수학적 방법
 */
public class SeriesOfNumMath05 {
    
    int solution(int n) {
        int answer = 0;
        int cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        SeriesOfNumMath05 T = new SeriesOfNumMath05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}
