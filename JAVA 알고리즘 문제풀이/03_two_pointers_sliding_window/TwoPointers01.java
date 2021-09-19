import java.util.ArrayList;
import java.util.Scanner;

/**
 * 오름차순 정렬된 두 배열을 오름차순으로 합치기 
 */
class TwoPointers01 {

    ArrayList<Integer> solution(int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        // a b 배열 포인터
        int ap = 0;
        int bp = 0;

        while (ap < a.length && bp < b.length ) {
            if ( a[ap] < b[bp]) {
                answer.add(a[ap++]);
            } else {
                answer.add(b[bp++]);
            }
        }
        while (ap < a.length) answer.add(a[ap++]);
        while (bp < b.length) answer.add(b[bp++]);
        return answer;
    }

    public static void main(String[] args) {
        TwoPointers01 T = new TwoPointers01();
        Scanner kb = new Scanner(System.in);
        int n1 = kb.nextInt();
        int[] a = new int[n1];
        for (int i=0; i<n1; i++) {
            a[i] = kb.nextInt();
        }
        int n2 = kb.nextInt();
        int[] b = new int[n2];
        for (int i=0; i<n2; i++) {
            b[i] = kb.nextInt();
        }
        for (int num : T.solution(a, b)) {
            System.out.print(num + " ");
        }
    }
}
