import java.util.Scanner;

public class FakeScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score_amount = sc.nextInt();
        int minimum_score = Integer.MAX_VALUE;
        int maximum_score = Integer.MIN_VALUE;
        double total = 0;

        for (int count = 0; count < score_amount; count++) {
            int temp = sc.nextInt();

            total += temp;
            if (temp < minimum_score) {
                minimum_score = temp;
            } else if (temp > maximum_score) {
                maximum_score = temp;
            }
        }
        total /= maximum_score;
        total *= 100;
        total /= score_amount;

        System.out.println(total);
    }
}
