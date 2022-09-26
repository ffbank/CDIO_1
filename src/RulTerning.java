import java.util.Random;
//For at værdien af terninger, bliver tilfældige
public class RulTerning {
    public static void main(String[] args) {
        // Laver en generator der giver tilfældige værdier

        Random r = new Random();

            int result = r.nextInt(6); // vi sætter tilfældigheden til at være 0 - 5 fordi i nextInt. så ekskludere den værdien man sætter ind, dvs 6
            result++;                           // result++ betyder jeg ligger 1, til resultatet, derfor kan værdien 6 være med
            System.out.println("Du slog en " + result);

    }
}
