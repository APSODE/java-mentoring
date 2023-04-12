import java.util.Scanner;

public class MaximumMinimumInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer_amount = sc.nextInt();
        int maximun_integer = 0, minimum_integer = 0, temp = 0;
        for (int count = 0; count < integer_amount; count++) {
            temp = sc.nextInt();
            if (count == 0) {
                minimum_integer = temp;
            }
            if (temp > maximun_integer) {
                maximun_integer = temp;
            } else if (temp < minimum_integer) {
                minimum_integer = temp;
            }
        }
        System.out.println(minimum_integer + " " + maximun_integer);
    }
}
