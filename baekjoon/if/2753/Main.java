import java.util.Scanner;

/**
 * 윤년
 * https://www.acmicpc.net/problem/2753
 */
class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yyyy = sc.nextInt();
        sc.close();
        
        System.out.println(((yyyy % 4) == 0 && (yyyy % 100) != 0) || (yyyy % 400) == 0 ? 1 : 0);        
    }
}
