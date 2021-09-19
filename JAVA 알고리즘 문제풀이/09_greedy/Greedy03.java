import java.util.*;

/**
 * 결혼식
 */

class TimeS implements Comparable<TimeS> {
    public int time;
    public char state;

    TimeS(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(TimeS ob) {
        if(this.time == ob.time) return this.state - ob.state;
        else return this.time - ob.time;
    }
}

class Greedy03 {
    public int solution(ArrayList<TimeS> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;

        for (TimeS ob : arr) {
            if (ob.state == 's') cnt++;
            else cnt--;

            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Greedy03 T = new Greedy03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<TimeS> arr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int sT = kb.nextInt();
            int eT = kb.nextInt();
            arr.add(new TimeS(sT, 's'));
            arr.add(new TimeS(eT, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}
