package ln;

public class Loan {
    private String acno;
    private double amt;
    private int duration;

    public Loan(String acno, double amount, int duration) {
        this.acno = acno;
        this.amt = amt;
        this.duration = duration;
    }

    public double getAmt() {
        return amt;
    }

    public int getDuration() {
        return duration;
    }
}


















