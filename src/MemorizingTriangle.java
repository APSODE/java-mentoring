import java.util.Scanner;

public class MemorizingTriangle {
    public static void main(String[] args) {
        int angle_f, angle_s, angle_t, total_angle;
        Scanner sc = new Scanner(System.in);

        angle_f = sc.nextInt();
        angle_s = sc.nextInt();
        angle_t = sc.nextInt();
        total_angle = angle_f + angle_s + angle_t;

        if (angle_f == 60 && angle_s == 60 && angle_t == 60) {
            System.out.println("Equilateral");
        } else if (total_angle == 180 && (angle_f == angle_s || angle_s == angle_t || angle_f == angle_t)) {
            System.out.println("Isosceles");
        } else if (total_angle == 180) {
            System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }
    }
}
