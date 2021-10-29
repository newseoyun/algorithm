import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 합
 * https://www.acmicpc.net/problem/8393
 */
class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.valueOf(br.readLine());
        br.close();
        // System.out.println( (1 + n) * n / 2 );
        for (int i=num-1; i>=0; i--) num += i; 
        System.out.println(num);
    }
}
