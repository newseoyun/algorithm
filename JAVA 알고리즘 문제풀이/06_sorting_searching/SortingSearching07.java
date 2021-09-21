import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 좌표 정렬(compareTo)
 */
public class SortingSearching07 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<innerPoint> arr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new innerPoint(x, y));
        }
        Collections.sort(arr);

        for (innerPoint point : arr) {
            System.out.println(point.x + " " + point.y);
        }
    }
}

class innerPoint implements Comparable<innerPoint> {
    int x;
    int y;

    public innerPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(innerPoint o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}
