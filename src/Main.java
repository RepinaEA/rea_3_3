public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double percentYear; //годовая ставка по кредиту
        double year; //срок кредита, год
        double summa; //сумма кредита
        double creditPayment_1 = service.calculate(9.99, 1, 1_000_000); // ежемесячный платеж по кредиту
        System.out.println("Ежемесячный платеж по кредиту на срок 1 год: " + creditPayment_1 + " ₽");

        double creditPayment_2 = service.calculate(9.99, 2, 1_000_000); // ежемесячный платеж по кредиту
        System.out.println("Ежемесячный платеж по кредиту на срок 2 года: " + creditPayment_2 + " ₽");

        double creditPayment_3 = service.calculate(9.99, 3, 1_000_000); // ежемесячный платеж по кредиту
        System.out.println("Ежемесячный платеж по кредиту на срок 3 года: " + creditPayment_3 + " ₽");
    }
}