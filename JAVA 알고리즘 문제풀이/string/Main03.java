import java.util.*;

/**
 * 문장 속 단어 (긴 단어 찾기)
 */
class Main03 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}
