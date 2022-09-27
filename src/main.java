import java.util.Random;
import java.util.Scanner;
public class main {
    static Terning terning;
    static int Spiller1sum = 0;
    static int Spiller2sum = 0;
    static int Spiller = 1;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        terning = new Terning(6);
        System.out.println("Spiller 1 tryk enter for at begynde");
        while (Spiller1sum < 40 && Spiller2sum < 40) {

            scan.nextLine();
            terning.slag();
            summen(terning.slag1, terning.slag2, Spiller);
        }
        if(Spiller1sum >= 40){
            System.out.println("Spiller 1 vinder!");
        }else {
            System.out.println("Spiller 2 vinder!");
        }

    }

            /**public static int rulterninger () {
                Random r = new Random();
                int result = r.nextInt(6); // vi sætter tilfældigheden til at være 0 - 5 fordi i nextInt. så ekskludere den værdien man sætter ind, dvs 6
                result++;                           // result++ betyder jeg ligger 1, til resultatet, derfor kan værdien 6 være med
                System.out.println("Du slog en " + result);

                int result2 = r.nextInt(6);
                result2++;
                System.out.println("og en "+ result2);


                return result;

            } **/
            public static void summen ( int resultat, int resultat2, int spiller){
                if (spiller == 1) {
                    Spiller1sum += resultat + resultat2;
                    System.out.println("Summen af slag er: " + Spiller1sum);

                    if (resultat==resultat2) {
                        System.out.println("Spiller 1's tur igen");
                        return;
                    }

                    System.out.println("spiller 2's tur ");
                    Spiller = 2;
                }
                else if (spiller == 2) {
                    Spiller2sum += resultat + resultat2;
                    System.out.println("Summen af slag er: " + Spiller2sum);

                    if (resultat==resultat2) {
                        System.out.println("Spiller 2's tur igen");
                        return;
                    }

                    System.out.println("Spiller 1's tur ");
                    Spiller = 1;

                }
            }


}



