import java.util.Arrays;
import java.util.Scanner;

/**
 * 뮤직비디오(결정알고리즘)
 */
public class SortingSearching09 {
    
    /**
     * <pre> 
    입력 예
    9 3
    1 2 3 4 5 6 7 8 9
     * </pre>
     * @param n 총 곡 수
     * @param x 곡 수
     * @param arr 곡들
     * @return 용량
     */
    int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    static int count(int[] arr, int capacity) {
        int cnt = 1;
        int sum = 0;

        for(int x : arr) {
            if(sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        SortingSearching09 T = new SortingSearching09();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
