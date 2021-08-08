import java.util.Scanner;

/**
 * 등수 구하기
 */
public class Array08 {
    
    int[] solution(int n, int[] arr) {
        int[] answer = new int[n]; // int 배열은 생성 시 각 값이 0으로 초기화됨.
        for(int i=0; i<n; i++) {
            int cnt = 1;
            for(int j=0; j<n; j++) {
                if(arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Array08 T = new Array08();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, arr)) System.out.print(x + " ");
    }

}
