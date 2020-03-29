import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Расчёт аннуитетного платежа по кредиту.");
        System.out.print("Введите сумму кредита (руб): ");
        int credit = in.nextInt();
        System.out.print("Введите срок (мес): ");
        int period = in.nextInt();
        System.out.print("Введите годовую процентную ставку (%): ");
        float percent = in.nextFloat();
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        int payment = creditPaymentService.calculate(credit, period, percent);

        System.out.print("Платёж составит (руб/мес): " + payment);

    }

}
