import java.util.Scanner;
import java.util.Stack;

/**
 * 올바른 괄호
 */
public class StackQueue01 {

    String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for(char a : str.toCharArray()) {
            if(a == '(') stack.push(a);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        StackQueue01 T = new StackQueue01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
