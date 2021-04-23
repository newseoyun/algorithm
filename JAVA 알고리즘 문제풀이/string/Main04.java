import java.util.*;

/**
 * 단어 뒤집기
 */
class Main04 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            /*
            // reverse() 이용해서 순서대로 뒤집기
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
            */

            // 뒤집는 방식을 직접 구현: 양 끝을 점점 가운데로 서로 교환하기
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

            // valueOf는 String 클래스의 스태틱 메소드이기 때문에 "String.valueOf(obj)" 로 쓰는 것.
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
