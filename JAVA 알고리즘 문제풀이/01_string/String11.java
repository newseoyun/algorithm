import java.util.*;

/**
 * 문자열 압축
 */
class String11 {
    public String solution(String s) {
        String answer = "";
        int cnt = 1;
        s = s + " "; // 마지막 단어 짤림 방지하기 위해 공백 추가

        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) cnt++;
            else {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String11 T = new String11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
