public class main {

    public static void main(String[] args) {

        Raffle raffle = new Raffle();
        Raffle raffle2 = new Raffle();
        Player player = new Player();
        Player player2 = new Player();
        int P1point = player.getPoint(), P2point = player2.getPoint();
        boolean P1point1;


        while (P1point <= 40 && P2point <= 40) {
        System.out.println("Spiller1 slår:");
        raffle.roll();
        System.out.println("Spiller1 får summen:");
        P1point = (player.getPoint() + raffle.getPointSum());
        System.out.println(P1point);



        System.out.println("Spiller2 slår:");
        raffle2.roll();
        System.out.println("Spiller2 får summen:");
        P2point = (player2.getPoint() + raffle2.getPointSum());
        System.out.println(P2point);
        }


    }


}



