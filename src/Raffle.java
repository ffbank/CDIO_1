public class Raffle {
    private Terning t1;
    private Terning t2;

    public int getPointSum() {
        return pointSum;
    }

    private int pointSum;

    public Raffle(){
        this.pointSum = 0;
        this.t1 = new Terning();
        this.t2 = new Terning();
    }
    public boolean roll(){
        int t1roll = t1.roll();
        int t2roll = t2.roll();
        System.out.println(t1);
        System.out.println(t2);

        pointSum += t1.getFaceValue() + t2.getFaceValue();

        return (t1roll == t2roll) ? true : false;
    }
}
