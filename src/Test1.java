public class Test1 {
    public static void main (String[] args) {
        int spiller1[] = new int[10];
        int spiller2[] = new int[10];
        int spiller1Score = 0;
        int spiller2Score = 0;
        int runde = 1;


        while (spiller1Score < 40 && spiller2Score < 40) {
            for (int i = 0; i < spiller1.length; i++) {
                System.out.println("Rul terning runde: " + runde++);
                spiller1[i] = (int) ((Math.random() * 6) + 1);
                spiller2[i] = (int) ((Math.random() * 6) + 1);

                System.out.println("Spiller 1 har " + spiller1[i]);
                System.out.println("Spiller 2 har " + spiller2[i]);


                if (spiller1[i] == spiller2[i]) {
                    spiller1Score = spiller1Score + 3;
                    spiller2Score = spiller2Score + 3;
                } else if (spiller1[i] > spiller2[i]) {
                    spiller1Score = spiller1Score + 5;
                } else if (spiller2[i] > spiller1[i]) {
                    spiller2Score = spiller2Score + 5;
                }


                System.out.println("Spillet er ovre");

                if (spiller1Score >= spiller2Score)
                    System.out.println("Vinderen er spiller 1");
                else
                    System.out.println("Vinderen er spiller 2");

                System.out.println("Runder spillet: " + runde);

                System.out.println("Total score per spiller:");
                System.out.println("Spiller 1 score: " + spiller1Score);
                System.out.println("Spiller 2 score: " + spiller2Score);
            }

        }



    }

}
