import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int input_year;
        Scanner sc = new Scanner(System.in);
        input_year = sc.nextInt();
        if (((input_year % 4 == 0) && (input_year % 100 != 0)) || input_year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
