public class CreditPaymentService {
    public double calculate(double percentYear, double year, double summa) {
        double month = year * 12; // срок кредита, месяц
        double percentMonth = percentYear / (100 * 12); // месячная ставка по кредиту
        double coefficient_1 = percentMonth + 1;
        double coefficient_2 = Math.pow(coefficient_1, -month);
        double coefficient_3 = 1 - coefficient_2;
        double coefficient_4 = percentMonth / coefficient_3;
        double creditPayment = summa * coefficient_4; // ежемесячный платеж
        int creditPayment_i = (int) Math.round(creditPayment); // ежемесячный платеж округленный


        return creditPayment_i;
    }
}
