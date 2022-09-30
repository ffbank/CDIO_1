import java.util.Random;
public class TerningTest {
    public static void main(String[] args) {
        Random random = new Random();
        int ener=0;
        int toer=0;
        int treer=0;
        int firer=0;
        int femmer=0;
        int sekser=0;


        for(int i=0; i<1000;i++){

            int result = random.nextInt(6)+1;
            if(result==1) {
                ener++;
            }else if (result==2) {
                toer++;
            } else if (result==3) {
                treer++;
            }else if (result==4){
                firer++;
            } else if (result==5) {
                femmer++;
            }else if (result==6) {
                sekser++;
            }
        }
        System.out.println(ener+ "enere");
        System.out.println(toer+ "toere");
        System.out.println(treer+ "treere");
        System.out.println(firer+ "firere");
        System.out.println(femmer+ "femmere");
        System.out.println(sekser+ "seksere");
    }

}
