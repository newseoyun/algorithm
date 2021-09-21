import java.util.Scanner;

/**
 * 삽입정렬
 */
public class SortingSearching03 {
    
    int[] solution(int n, int[] arr) {
        for (int i=1; i<n; i++) {
            int tmp = arr[i];
            int j = 0;

            for (j=i-1; j>=0; j--) {
                if (arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        SortingSearching03 T = new SortingSearching03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) arr[i] = kb.nextInt();
        for (int a : T.solution(n, arr)) System.out.print(a + " ");
    }
}
