import java.util.ArrayList;
import java.util.Scanner;

/**
 * 장난꾸러기
 */
public class SortingSearching06 {
    
    ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer =  new ArrayList<>() ;

        // 내 풀이
        for (int i=1; i<n; i++) {
            if (arr[i-1] > arr[i]) {
                answer.add( answer.isEmpty() ? i : i + 1 );
            }
        }

        // int[] tmp = arr.clone();
        // Arrays.sort(tmp);
        // for (int i=0; i<n; i++) {
        //     if (arr[i] != tmp[i]) answer.add(i+1);
        // }

        return answer;
    }

    public static void main(String[] args) {
        SortingSearching06 T = new SortingSearching06();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        
        for (int i=0; i<n; i++) arr[i] = kb.nextInt();
        for (int a : T.solution(n, arr)) System.out.print(a + " ");
    }
}
