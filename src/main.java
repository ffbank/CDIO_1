public class main {

    public static void main(String[] args) {

        Raffle raffle = new Raffle();
        Raffle raffle2 = new Raffle();
        Player player = new Player();
        Player player2 = new Player();
        int P1point = player.getPoint(), P2point = player2.getPoint();
        boolean isP1 = false;
        boolean isPair = false;

        while (P1point <= 40 && P2point <= 40) {
            isPair = false;
            if(isP1){
                System.out.println("Spiller1 slår:");

                isPair = raffle.roll();

                System.out.println("Spiller1 får summen:");
                P1point = (player.getPoint() + raffle.getPointSum());
                System.out.println(P1point);
                if(isPair) {
                    System.out.println("spiller ");
                    continue;
                }

            }else {
                System.out.println("Spiller2 slår:");

                isPair = raffle2.roll();

                System.out.println("Spiller2 får summen:");
                P2point = (player2.getPoint() + raffle2.getPointSum());
                System.out.println(P2point);
                if(isPair)continue;
            }
            isP1 = !isP1;

        }
        System.out.println(P1point >= 40 ? "Spiller 1 vinder" : "Spiller 2 vinder");


    }


}



