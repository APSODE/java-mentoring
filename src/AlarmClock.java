import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        int hour, minute;

        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        minute = sc.nextInt();

        minute -= 45; // 45분 추가

        if (minute < 0) {
            minute += 60; // 60분을 1시간으로 바꾸기위해서 60분 감소
            hour -= 1; // 빠진 60분을 1시간으로 변환후 더함
        }

        if (hour < 0) {
            hour += 24; // 24시간 계산
        }

        System.out.println(hour + " " + minute);
    }
}
