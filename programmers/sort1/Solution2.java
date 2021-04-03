package sort1;
import java.util.*;

class Solution2 {
    public int[] solution2(int[] array, int[][] commands) {
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

    /**
     * 퀵정렬: 가운뎃값(pivot)을 기준잡고 Start, End를 pivot과 비교하여 작은 값은 왼쪽으로, 큰 값은 오른쪽으로 스왑
     * Start, End 위치 역전 시 1회차 끝
     * 평균 O(n log n) 최악의 경우 O(n²)
     */
    static int[] quickSort(int[] arr, int leftIdx) {
        int rightIdx = arr.length -1;
        int pivot = (leftIdx + rightIdx)/2;

        if (arr[0] < arr[leftIdx]) {
            return arr;
        } else {

            while (leftIdx <= rightIdx) {
                while (arr[leftIdx] < arr[pivot]) {
                    leftIdx++;
                }
                while (arr[rightIdx] > arr[pivot]) {
                    rightIdx--;
                }

                // swap
                if (leftIdx <= rightIdx) {
                    int temp = arr[leftIdx];
                    arr[leftIdx] = arr[rightIdx];
                    arr[rightIdx] = temp;
                    leftIdx++;
                    rightIdx--;
                    System.out.println(" SWAP ");
                }
                System.out.println("round >> " + Arrays.toString(arr));
            }
            return quickSort(arr, leftIdx);
        }
    }

    public static void main(String[] args) {
        // int[] testArr = {7, 5, 4, 9, 3, 6, 2, 8, 1};
        int[] testArr = {7, 5, 4, 9, 6, 2, 8, 1};

        System.out.println(Arrays.toString(testArr));

        quickSort(testArr, 0);

        System.out.println(Arrays.toString(testArr));

    }

}

