import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 기찍 N
 * https://www.acmicpc.net/problem/2742
 */
class Main {

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i=n; i>=1; i--) {
            bw.write(i + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
    
}
