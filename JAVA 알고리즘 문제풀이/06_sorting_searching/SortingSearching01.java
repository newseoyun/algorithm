import java.util.Scanner;

/**
 * 선택정렬
 */
public class SortingSearching01 {
    
    int[] solution(int n, int[] arr) {
        for (int i=0; i<n-1; i++) {
            int idx = i;
            
            for (int j=i+1; j<n; j++) {
                if (arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        SortingSearching01 T = new SortingSearching01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
