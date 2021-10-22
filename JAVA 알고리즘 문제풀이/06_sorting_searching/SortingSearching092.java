import java.util.Scanner;

public class SortingSearching092 {

    
    public static void main(String[] args) {
        SortingSearching09 T = new SortingSearching09();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
    
}
