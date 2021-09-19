import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 응급실 풀이 
 */

class Patient { // 환자 instance
    int id; // 접수 순서
    int priority; // 위험도(우선순위)
    public Patient(int id, int danger) {
        this.id = id;
        this.priority = danger;
    }
}

public class StackQueue082 {
    
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Patient> queue = new LinkedList<>();
        
        for (int i=0; i<n; i++) {
            queue.offer(new Patient(i,arr[i]));
        }

        while (!queue.isEmpty()) {
            Patient temp = queue.poll();
            for (Patient x : queue) {
                // temp 환자보다 위험도 높은 환자 존재하는 경우
                if (temp.priority<x.priority) { 
                    queue.offer(temp); // temp 환자를 맨뒤로
                    temp = null;
                    break;
                }				
            }
            if (temp!=null) { // 진료 받는 환자
                answer++;
                if (temp.id==m) return answer; // m번째 환자인 경우
            }			
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // n명의 환자
        int m = scanner.nextInt(); // m번째 환자
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt(); // 대기목록 순서의 환자 위험도
        }
        System.out.println(solution(n,m,arr));
    }
}
