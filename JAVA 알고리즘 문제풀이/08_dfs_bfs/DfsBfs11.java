import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 미로의 최단거리 통로(BFS)

07-14 그래프 최단거리 참고.
입력 격자판과 같은 크기의 배열을 만들어서 거리(이동횟수)를 저장함.


입력
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0

출력
12

 */
public class DfsBfs11 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int[][] distances;

    void BFS(int x, int y) {
        Queue<innerPoint> Q = new LinkedList<>();
        Q.offer(new innerPoint(x, y));
        board[x][y] = 1;

        while (!Q.isEmpty()) {
            innerPoint tmp = Q.poll();
            for (int i=0; i<4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer(new innerPoint(nx, ny));
                    distances[nx][ny] = distances[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        DfsBfs11 T = new DfsBfs11();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];
        distances = new int[8][8];
        for (int i=1; i<=7; i++) {
            for (int j=1; j<=7; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        T.BFS(1, 1);
        if (distances[7][7] == 0) System.out.println(-1);
        else System.out.println(distances[7][7]);
    }
    
}

class innerPoint {
    int x, y;
    innerPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}