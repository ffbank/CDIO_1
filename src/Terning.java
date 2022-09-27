
// Objektet af en terning
import java.util.Random;
public class Terning {
    // Public class, kan bruges af andre mains, hvis man ikke sætter det ind i "mainet" og definitioner, med int, er variabler for objektet
    public int sider;
    public int slag1, slag2;
    public Terning(int sider){
        this.sider = sider;

    }
    // Herunder har vi metoden, for objektets opgave, hvilket er at kaste 2 terninger
    public void slag(){
        // Vi anvender variablerne for at udføre opgaven, hvilket er: slag
        Random r = new Random();
        slag1 = r.nextInt(6); // vi sætter tilfældigheden til at være 0 - 5 fordi i nextInt. så ekskludere den værdien man sætter ind, dvs 6
        slag1++;                           // result++ betyder jeg ligger 1, til resultatet, derfor kan værdien 6 være med
        System.out.println("Du slog en " + slag1);

        slag2 = r.nextInt(6);
        slag2++;
        System.out.println("og en "+ slag2);

    }

    }

