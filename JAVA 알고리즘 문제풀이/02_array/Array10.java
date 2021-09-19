import java.util.Scanner;

/**
 * 봉우리 개수
 * (격자판에 입력된 숫자 중 상하좌우 숫자보다 큰 숫자들이 몇개인지)
 */
public class Array10 {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};

    int solution(int n, int[][] arr) {
        int answer = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                boolean isMaxBong = true;

                for(int k=0; k<dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (   nx >= 0 
                        && nx < n 
                        && ny >= 0 
                        && ny < n 
                        && arr[nx][ny] >= arr[i][j]
                    ) {
                        isMaxBong = false;
                    }
                }
                if(isMaxBong) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array10 T = new Array10();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
