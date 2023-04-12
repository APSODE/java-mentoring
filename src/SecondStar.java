import java.util.Scanner;

public class SecondStar {
    public static void main(String[] args) {
        int line_amount;


        Scanner sc = new Scanner(System.in);
        line_amount = sc.nextInt();
        for (int count = 0; count <= line_amount; count++) {
            StringBuilder star_string = new StringBuilder();
            for (int blank_amount = 0; blank_amount < line_amount - count; blank_amount++) {
                star_string.append(" ");
            }
            for (int star_amount = 0; star_amount < count; star_amount++) {
                star_string.append("*");
            }
            System.out.println(star_string);
        }

    }
}
