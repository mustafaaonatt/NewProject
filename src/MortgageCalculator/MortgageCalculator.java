package MortgageCalculator;

public class MortgageCalculator {
    private  final static byte monthInYear = 12;
    private final static byte percent = 100;
    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentsMade) {

        short numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {

        short numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;

    }

    public double[] getRemainingBalances() {
        double[] balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++) {
            balances[month - 1] = calculateBalance(month);
        }
        return balances;
    }

    private float getMonthlyInterest() {
        return annualInterest / percent / monthInYear;
    }


    private short getNumberOfPayments() {
        return (short) (years * monthInYear);
    }
}
