import java.util.Scanner;

/**
 * 알람시계
 * https://www.acmicpc.net/problem/2884
 */
class Main {

    static void alarm(int hour, int minute) {
        int total_minute = hour * 60 + minute;
        if (total_minute < 45) total_minute += 1440; // 24 * 60

        int alarm_minute = total_minute - 45;
        System.out.println(alarm_minute / 60 + " " + alarm_minute % 60);
    }

    public static void main(String agrs[]) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        scanner.close();

        alarm(hour, minute);
    }
}
