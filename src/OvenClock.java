import java.util.Scanner;

public class OvenClock {
    public static void main(String[] args) {
        int hour, minute;

        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        minute = sc.nextInt();

        minute += sc.nextInt(); // 시간 추가

        if (minute >= 60) {
            int over_h = (minute / 60);
            minute -= 60 * over_h; // 60분을 1시간으로 바꾸기위해서 60분 감소
            hour += over_h; // 빠진 60분을 1시간으로 변환후 더함
        }

        if (hour >= 24) {
            hour -= 24; // 24시간 계산
        }

        System.out.println(hour + " " + minute);
    }
}
