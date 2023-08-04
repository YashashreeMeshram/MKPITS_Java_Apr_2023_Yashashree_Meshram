package intCal;

public final class InterestCalculation {
    private final int rateOfInterest;
    public InterestCalculation(){
        rateOfInterest=10;
    }
    public final void calculateInterest(double amount, int duration){
        System.out.println("Interest ="+(amount+duration));
}
}
