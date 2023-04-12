import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int maximum_input = 0;

        int[] divisor_array = new int[amount];

        for (int count = 0; count < amount; count++) {
            int input_num = sc.nextInt();
            maximum_input = Math.max(maximum_input, input_num);
            divisor_array[count] = input_num;
        }

        while (true) {
            int checked_number = 0;
            for (int number: divisor_array) {
                if (maximum_input % number != 0) {
                    maximum_input++;
                } else {
                    checked_number++;
                }

                if (checked_number == amount) {
                    break;
                }
            }
            if (checked_number == amount) {break;}
        }
        System.out.println(maximum_input);



    }
}
