import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 합
 * https://www.acmicpc.net/problem/8393
 */
class Main {

    public static void main(String args[]) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test;
        try {
            test = Integer.parseInt(br.readLine());
            br.close();
            System.out.println("test? " + test);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
