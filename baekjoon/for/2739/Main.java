import java.util.Scanner;

/**
 * 구구단
 * https://www.acmicpc.net/problem/2739
 */
class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for (int i=1; i<=9; i++) {
            System.out.format("%d * %d = %d", num, i, num*i);
            System.out.println();
        }
    }
}
