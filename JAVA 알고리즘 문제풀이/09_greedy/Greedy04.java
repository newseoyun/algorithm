import java.util.*;

/**
 * 최대 수입 스케줄(우선순위큐 응용)
 */

class Lecture implements Comparable<Lecture> {
    public int money;
    public int time;

    Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture ob) {
        return ob.time - this.time; // 내림차순
    }
}

class Greedy04 {
    static int n; 
    static int max = Integer.MIN_VALUE;
    
    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);

        int j = 0;
        for (int i=max; i>=1; i--) {
            for (; j<n; j++) {
                if (arr.get(j).time < i) break;
                pQ.offer(arr.get(j).money);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Greedy04 T = new Greedy04();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        
        ArrayList<Lecture> arr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int m = kb.nextInt();
            int d = kb.nextInt();
            arr.add(new Lecture(m, d));
            if (d > max) max = d;
        }
        System.out.println(T.solution(arr));
    }
}
