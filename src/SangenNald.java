import java.util.Scanner;

public class SangenNald {
    public static void main(String[] args) {
        int cola, sprite, sangen, jungduk, haduck, temp;
        Scanner sc = new Scanner(System.in);

        sangen = sc.nextInt();
        jungduk = sc.nextInt();
        haduck = sc.nextInt();
        cola = sc.nextInt();
        sprite = sc.nextInt();

        temp = sangen;

        if (jungduk < temp) {
            temp = jungduk;
        }

        if (haduck < temp) {
            temp = haduck;
        }

        System.out.println(temp + (Math.min(cola, sprite)) - 50);


    }
}
