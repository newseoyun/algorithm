import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 별 찍기 - 1
 * https://www.acmicpc.net/problem/2438
 */
class Main {
    
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();
        for (int i=1; i<=n; i++) {
            bw.write( "*".repeat(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
