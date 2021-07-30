import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 공통원소 구하기 (교집합)
 */
public class TwoPointers02 {
    
    ArrayList<Integer> solution(int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0;
        int p2 = 0;

        while (p1 < a.length && p2 < b.length) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            } else p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        TwoPointers02 T = new TwoPointers02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[n];
        for (int i=0; i<n; i++) {
            b[i] = kb.nextInt();
        }
        for (int ss : T.solution(a, b)) {
            System.out.print(ss + " ");
        }
    }
}
