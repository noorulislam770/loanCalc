package LOANCALCULATOR;


public class Loan {
    private static final int monthsInYears  = 12;

    private double loanAmount;
    private double monthlyInterestRate;
    private double numberOfPayments;

    Loan(double loanAmount,double interestRate, double loanPeriod){
        setAmount(loanAmount);
        setRate(interestRate);
        setPeriod(loanPeriod);
    }

    private void setRate(double rate) {
        monthlyInterestRate = rate /100.0/monthsInYears;
    }

    private void setAmount(double amount) {
        loanAmount = amount;
    }

    private void setPeriod(double periodInYear) {
        numberOfPayments = periodInYear * 12;
        
    }
    public double getRate(){
        return monthlyInterestRate;
    }
    public double getAmount() {
        return loanAmount;
    }
    public double getPeriod() {
        return (numberOfPayments/ monthsInYears);
    }

    public double getMonthlyPayment(){
        double monthlyPayment;
        monthlyPayment = (loanAmount * monthlyInterestRate)/(1 - Math.pow(1/(1+monthlyInterestRate), numberOfPayments));
        return monthlyPayment;
    }
    
    public double getTotalPayment(){
        double totalPayment;
        totalPayment = getMonthlyPayment() * numberOfPayments;
        return totalPayment;
    }
    
    public double  getInterestAmount(){
        return (getTotalPayment() - loanAmount);
    }



}