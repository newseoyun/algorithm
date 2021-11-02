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
        int n = Integer.valueOf(br.readLine());
        br.close();
        // System.out.println( (1 + n) * n / 2 );
        for (int i=n-1; i>=0; i--) n += i; 
        System.out.println(n);
    }
}
