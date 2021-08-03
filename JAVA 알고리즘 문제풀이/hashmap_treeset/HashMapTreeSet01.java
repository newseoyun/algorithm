import java.util.HashMap;

/**
 * 학급 회장 (입력 문자 중 가장 많은 문자)
 */
public class HashMapTreeSet01 {

    char solution(int n, String n) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(ket) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        HashMapTreeSet01 T = new HashMapTreeSet01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
