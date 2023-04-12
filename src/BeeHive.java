import java.util.Scanner;

public class BeeHive {
    public static void main(String[] args) {
        //6 12 18 24
        Scanner sc = new Scanner(System.in);
        int input_num = sc.nextInt();
        int check_count = 1;
        int next_check_hive_number = 1;
        final int increased_room_count_ratio = 6;

        while (input_num <= next_check_hive_number) {
            next_check_hive_number += increased_room_count_ratio * check_count++;
        }
        System.out.println(check_count);
    }
}
