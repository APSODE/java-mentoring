import java.util.ArrayList;
import java.util.Scanner;

public class WhoDontSubmit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> integer_array = new ArrayList<>();
        for (int count = 0; count < 28; count++) {
            integer_array.add(sc.nextInt());
        }
        for (int number = 1; number <= 30; number++) {
            if (!integer_array.contains(number)) {
                System.out.println(number);
            }
        }
    }
}
