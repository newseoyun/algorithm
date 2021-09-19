import java.util.Arrays;
import java.util.Scanner;

/**
 *  마구간 정하기(결정알고리즘)
 */
public class SortingSearching10 {
    
    int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(count(arr, mid) >=  c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        SortingSearching10 T = new SortingSearching10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, c, arr));
    }
}
