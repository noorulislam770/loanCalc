
import java.text.DecimalFormat;
import java.util.Scanner;


public class LoanCalculator {
    Scanner input = new Scanner(System.in);
    private final DecimalFormat formatter = new DecimalFormat("#0.000");
    private Loan loan;
    public static void main(String[] args) {
        
        LoanCalculator calculator = new LoanCalculator();
        calculator.start();


    }
    public LoanCalculator(){
        softwareInfo();
        describeProgram ();
    }

    public void start(){
        
        getInput();
        displayOutput();
        options();

        
    }

    // this method is for taking options from users that if they want to calculate more and other stuffs.
    // is a new feature
    private void options(){
        System.out.println("\tPress (1) to Calculate another (2) for info About Software (0) for exit.");
        System.out.print("\t====> HERE :");
        int option = input.nextInt();
        if (option != 0){
            if (option == 1){
                start();

            }else if (option == 2){
                softwareInfo();
                options();
            }
        }else{
            System.out.println("\n\t Thanks for using SLC calculator. ");
            System.out.println("\t See You Soon.. ");
            System.out.println("\t--------------------------------------------------");
        }
    }
    
    private void displayOutput() {
        System.out.println("\n\t ------------------- Calculation Results -----------------");
        System.out.println("\t---> Monthly Payment      ==> " + formatter.format(loan.getMonthlyPayment()));
        System.out.println("\t---> Total   Payment      ==> " + formatter.format(loan.getTotalPayment() ));
        System.out.println("\t---> Total Interest Amount==> " + formatter.format(loan.getInterestAmount()));
        System.out.println("\t---> Loan Period (Years)  ==> " + formatter.format(loan.getPeriod() ));
        System.out.println("\t---> Annual Interest Rate ==> " + formatter.format(loan.getRate() ) + "\n");

    }

    
    private void getInput() {
        System.out.println("\n\t--------- Fill in the form Below --------");
        System.out.println("\t---> Enter the Loan Amount ");
        System.out.print("\t-----> HERE : ");
        double loanAmount = input.nextDouble();
        System.out.println("\n\t---> Enter the interest rate: ");
        System.out.print("\t-----> HERE : ");
        double interestRate = input.nextDouble();
        System.out.println("\n\t---> Enter Loan Period : ");
        System.out.print("\t-----> HERE : ");
        double loanPeriod = input.nextDouble();
        loan = new Loan(loanAmount, interestRate, loanPeriod);
        
    }

    private void describeProgram() {
        System.out.println("\t----------------Program Description----------------");
        System.out.println("\t---- Welcome To the Simplest Laon Calculator ------");
        System.out.println("\t--> Three Simple steps to find the loan payment.  ");
        System.out.println("\t-------------------------------------------------");
    }

    
    // a new method for showing the software info.
    private void softwareInfo(){
        System.out.println("\n\t-------------- Software Info -----------------");
        System.out.println("\t............................................");
        System.out.println("\tuniversal loan Calculator.");
        System.out.println("\tversion : 1.1.0");
        System.out.println("\tgithub link : https://www.github.con/noorulislam770/loanCalculator");
        System.out.println("\tauthor : noor ul islam");
        System.out.println("\t............................................");


    }


}