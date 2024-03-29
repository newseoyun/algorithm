import java.util.*;

/**
 * 가장 높은 탑 쌓기(LIS 응용)
 */

class Brick implements Comparable<Brick> {
    public int baseArea;
    public int height;
    public int weight;

    Brick(int baseArea, int height, int weight) {
        this.baseArea = baseArea;
        this.height = height;
        this.weight = weight;
    }
    
    @Override
    public int compareTo(Brick o) {
        return o.baseArea - this.baseArea;
    }
}
class Dynamic04{
    static int[] dy;

    public int solution(ArrayList<Brick> arr) {
        int answer = 0;
        Collections.sort(arr);
        dy[0] = arr.get(0).height;
        answer = dy[0];

        for (int i=1; i<arr.size(); i++) {
            int max_h = 0;

            for (int j=i-1; j>=0; j--) {
                if (arr.get(j).weight > arr.get(i).weight && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + arr.get(i).height;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Dynamic04 T = new Dynamic04();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[n];

        for (int i=0; i<n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            arr.add(new Brick(a, b, c));
        }
        System.out.print(T.solution(arr));
    }
}
