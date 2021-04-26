import java.util.*;

/**
 * 숫자 추출
 */
class String09 {
    // 아스키 코드로 푸는 방법
    public int solution(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            // 아스키 코드 중 숫자, 문자의 시작과 끝 번호 정도는 외우기
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }
        return answer;
    }

    // 내장 API로 푸는 방법
    public int solution2(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        String09 T = new String09();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
