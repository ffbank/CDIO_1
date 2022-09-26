import java.util.Scanner;
import java.util.Random;
public class cdio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int Spillerscore1 = 0;
        int Spillerscore2 = 0;

        System.out.println("Hvor mange runder?");
        int rounds = scan.nextInt();

        for(int x = 0; x < rounds; x++) {
            int spillervalg1 = random.nextInt(6) + 1;
            int spillervalg2 = random.nextInt(6) + 1;

            if (spillervalg2 > spillervalg1) {
                spillervalg2 += 1;
            } else if (spillervalg2 < spillervalg1) {
                spillervalg1 += 1;

            }

            System.out.printf("Spillerscore1: %d\n cpu Spillerscore2: %d\n", Spillerscore1, Spillerscore2);

            if (Spillerscore2 > Spillerscore1) {
                System.out.println("Spiller 2 vandt!");
            } else if (Spillerscore2 < Spillerscore1) {
                System.out.println("Spiller 1 vandt!");
            } else {
                System.out.println("Uafgjort");
            }
        }

    }

}