import java.util.HashMap;
import java.util.Scanner;

/**
 * 아나그램 (길이가 같은 두 단어를 구성하는 알파벳의 종류&개수가 같음)
 */
public class HashMapTreeSet02 {

    String solution(String a, String b) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char y : b.toCharArray()) {
            if (!map.containsKey(y) || map.get(y) == 0) return "NO"; 
            map.put(y, map.get(y) - 1);
        }
        return answer;
    }
    
    public static void main(String[] args) {
        HashMapTreeSet02 T = new HashMapTreeSet02();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a, b));
    }
}
