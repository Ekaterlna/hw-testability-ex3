public class CreditPaymentService {
    public double calculate(int amountOfCredit, double interestRate, int creditTerm) {
        int degree = -1 * creditTerm;
        double interestRateMonth = interestRate / (12 * 100);
        double monthlyPaymentDouble = (amountOfCredit * interestRateMonth) / (1 - Math.pow((1 + interestRateMonth), degree));
        int monthlyPayment = (int) monthlyPaymentDouble;
        return monthlyPayment;
    }
}
