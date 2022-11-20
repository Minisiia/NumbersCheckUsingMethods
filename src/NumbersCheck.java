import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = scanner.nextInt();
        System.out.println(check(a));
    }

    static String check(int a) {
        String signOfARealNumber = "Число додатнє, ";
        String primeNumber = "просте, ";
        String division = "не ділиться на 2 5 3 6 9 без залишку";
// перевірка на додатне чи від'ємне число
        if (a < 0) {
            signOfARealNumber = "Число від'ємне, ";
// перевірка на просте від'ємне число
            int counterNegative = 0;
            for (int i = -2; i > a; i--) {
                if (a % i == 0) counterNegative++;
            }
            if (counterNegative > 0) primeNumber = "не є простим, ";
        }
        if (a == 0) return "Неможливо перевірити усі умови, бо введене число 0";
// перевірка на просте додатне число
        int counter = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) counter++;
        }
        if (counter > 0) primeNumber = "не є простим, ";
// перевірка ділення на 2 5 3 6 9 без залишку
        String div = "ділиться без залишку на";
        if (a % 2 == 0) div += " 2";
        if (a % 3 == 0) div += " 3";
        if (a % 5 == 0) div += " 5";
        if (a % 6 == 0) div += " 6";
        if (a % 9 == 0) div += " 9";
        if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0) division = div;
// збирання всіх умов у один рядок
        return signOfARealNumber + primeNumber + division;
    }
}
