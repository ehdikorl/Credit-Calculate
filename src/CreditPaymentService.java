public class CreditPaymentService {
    public double calculate(double credit, double tern, double percent) {

        double years = tern * 12;

        double monthPercent = percent / 12 / 100;
        double a = 1 + monthPercent;
        double payment = credit * ((monthPercent * Math.pow(a, years)) / (Math.pow(a, years) - 1));
        return payment;
    }
}


