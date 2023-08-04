import ln.Loan;
import intCal.InterestCalculation;

public class Main {
    public static void main(String[] args) {

        Loan myLoan=new Loan("1001",5000,9);
        InterestCalculation ic=new InterestCalculation();
        ic.calculateInterest(myLoan.getAmt(),myLoan.getDuration());
    }
}