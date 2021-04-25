import java.util.*;

/**
 * 유효한 팰린드롬 (회문 문자열)
 */
class String08 {
    public String solution(String str) {
        String answer = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        String08 T = new String08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
