import java.util.Scanner;

/**
 * 미로 탐색(DFS)

7 x 7 격자판에서 
출발점(1, 1), 도착점(7, 7)
각 칸의 1은 벽, 0은 통로

출발점에서 도착점까지 갈 수 있는 방법의 수?

입력
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0
1 0 0 0 0 0 0

출력
8

 */ 
public class DfsBfs10 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int answer;

    void DFS(int x, int y) {
        if (x == 7 && y == 7) answer++;
        else {
            for (int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        DfsBfs10 T = new DfsBfs10();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];
        for (int i=1; i<7; i++) {
            for (int j=1; j<=7; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        board[1][1] = 1;
        T.DFS(1, 1);
        System.out.print(answer);
    }
    
}
