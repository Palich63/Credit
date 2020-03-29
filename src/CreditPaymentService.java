import static java.lang.StrictMath.pow;

public class CreditPaymentService {
    public int calculate(int credit, int period, float percent) {
        float percentMonth = percent / 12 / 100;
        int payment = (int) ( credit * (percentMonth + (percentMonth / (pow((1 + percentMonth), period) - 1))));

        return payment;
    }


}
