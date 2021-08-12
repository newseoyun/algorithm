import java.util.Arrays;
import java.util.Scanner;

/**
 * 이분검색 (Binary Search)
 */
public class SortingSearching08 {

    /**
    <pre>
    예시 입력
        8 32 
        23 87 65 12 57 32 99 81
    </pre>
     * 
     * @param n 배열 사이즈
     * @param target 검색할 값
     * @param arr
     * @return int 위치 번호
     */
    int solution(int n, int target, int[] arr) {
        int answer = 0;
        int lt = 0;
        int rt = n - 1;
        Arrays.sort(arr);
        
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(arr[mid] == target) {
                answer = mid + 1;
                break;
            }
            if(arr[mid] > target) rt = mid - 1;
            if(arr[mid] < target) lt = mid + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        SortingSearching08 T = new SortingSearching08();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int target = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, target, arr));
    }
    
}
