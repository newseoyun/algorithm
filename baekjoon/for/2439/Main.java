import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 별 찍기 - 2
 * https://www.acmicpc.net/problem/2439
 */
class Main {
    
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();
        for (int i=1; i<=n; i++) {
            bw.write(" ".repeat(n-i) + "*".repeat(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
