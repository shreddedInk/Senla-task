package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Конвертер валют");
        System.out.print("Введите сумму в долларах (USD): ");
        double amount = scanner.nextDouble();

        double euro = Converter.toEuro(amount);
        double pound = Converter.toPound(amount);
        double ruble = Converter.toRuble(amount);
        double yen = Converter.toYen(amount);
        double yuan = Converter.toYuan(amount);

        System.out.println("В евро: " + euro);
        System.out.println("В фунтах: " + pound);
        System.out.println("В рублях: " + ruble);
        System.out.println("В иенах: " + yen);
        System.out.println("В юанях: " + yuan);

        scanner.close();
    }
}
