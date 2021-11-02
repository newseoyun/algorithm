import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


/**
 * A+B 8
 * https://www.acmicpc.net/problem/11022
 */
class Main {

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(br.readLine());
        int numOne = 0;
        int numTwo = 0;
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            numOne = Integer.parseInt(st.nextToken());
            numTwo = Integer.parseInt(st.nextToken());
            bw.write("Case #" + (i+1) + ": " + numOne + " + " + numTwo + " = " + (numOne + numTwo) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
