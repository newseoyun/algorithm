import java.util.Scanner;

/**
 * 사분면 고르기
 * https://www.acmicpc.net/problem/14681
 */
public class Main {

    static int quadrant(int x, int y) {
        return (x > 0 && y > 0) ? 1 
                : (x < 0 && y > 0) ? 2
                : (x < 0 && y < 0) ? 3
                : 4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        System.out.println(quadrant(x, y));
    }
}
