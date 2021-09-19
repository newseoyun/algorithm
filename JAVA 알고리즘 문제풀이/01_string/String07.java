import java.util.*;

/**
 * 회문 문자열인지 (뒤에서부터 읽어도 같은 문자)
 */
class String07 {
    public String solution(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        int len = str.length();

        for (int i=0; i<len/2; i++) {
            if(str.charAt(i) != str.charAt(len - i - 1)) return "NO";
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        String07 T = new String07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
