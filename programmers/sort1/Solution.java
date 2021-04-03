package sort1;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;

        for (int[] com : commands) {
            int[] temp = Arrays.copyOfRange(array, com[0]-1, com[1]);
            Arrays.sort(temp);
            answer[count] = temp[com[2]-1];
            count++;
        }

        return answer;
    }
}

/**
 * 이렇게 API 쓰면 쉽고 간결하긴 하지만
 * 정렬 알고리즘을 직접 구현하는 것이 고득점 포인트인 것 같다.
 */