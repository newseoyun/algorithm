import java.util.ArrayList;
import java.util.Scanner;

/**
 * 피자 배달 거리
 */
public class DfsBfs15 {
    static int n;
    static int m;
    static int len;
    static int answer = Integer.MAX_VALUE;
    static int[] combination;
    static ArrayList<Point> pizza;
    static ArrayList<Point> house;

    void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            
            for (Point h : house) {
                int dis = Integer.MAX_VALUE;

                for (int i : combination) {
                    dis = Math.min(dis, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i=s; i<len; i++) {
                combination[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        DfsBfs15 T = new DfsBfs15();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pizza = new ArrayList<>();
        house = new ArrayList<>();

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                int tmp = kb.nextInt();
                if (tmp == 1) house.add(new Point(i, j));
                else if (tmp == 2) pizza.add(new Point(i, j));
            }
        }
        len = pizza.size();
        combination = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);;
    }
}
