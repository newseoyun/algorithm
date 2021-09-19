import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 송아지 찾기1(BFS)
 * 앞으로 1, 뒤로 1, 앞으로 5 이동할 수 있다.
 * 송아지 위치까지 최소 몇 번? (내 위치 5, 송아지위치 14)
 */
public class Rtg08 {

    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;

    Queue<Integer> Q = new LinkedList<>();

    int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int level = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();

            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx == e) return level + 1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Rtg08 T = new Rtg08();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
