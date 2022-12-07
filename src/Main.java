public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int price = 1000000;
        double percent = 9.99;
        int year = 1;
        int year2 = 2;
        int year3 = 3;

        double Payment = service.calculate(price, year, percent);
        System.out.println("Платеж по кредиту: " + Payment);

        Payment = service.calculate(price, year2, percent);
        System.out.println("Платеж по кредиту: " + Payment);

        Payment = service.calculate(price, year3, percent);
        System.out.println("Платеж по кредиту: " + Payment);

    }
}
