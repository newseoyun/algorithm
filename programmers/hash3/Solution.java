package programmers.hash3;

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int solution = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] set : clothes) {
            map.put(set[1], map.getOrDefault(set[1], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            solution *= (entry.getValue() + 1);
        }

        return solution - 1;
    }

}