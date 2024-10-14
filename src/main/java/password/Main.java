package password;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Генератор безопасного пароля");
        System.out.print("Введите длину пароля (от 8 до 12 символов): ");
        int length = scanner.nextInt();

        if (length < 8 || length > 12) {
            System.out.println("Неправильная длина. Пароль должен быть от 8 до 12 символов.");
        } else {
            String password = PasswordGenerator.generatePassword(length);
            System.out.println("Ваш пароль: " + password);
        }

        scanner.close();
    }
}
