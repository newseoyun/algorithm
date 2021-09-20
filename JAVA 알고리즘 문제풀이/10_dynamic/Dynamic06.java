import java.util.*;

/**
 * 최대 점수 구하기(냅색 알고리즘)
 */
class Dynamic06{

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] dy = new int[m + 1];

        for (int i=0; i<n; i++) {
            int value = kb.nextInt();
            int time = kb.nextInt();

            for (int j=m; j>=time; j--) {
                dy[j] = Math.max(dy[j], dy[j - time] + value);
            }
        }
        System.out.print(dy[m]);
    }
}
