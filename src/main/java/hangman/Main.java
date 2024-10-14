package hangman;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                HangmanGame game = new HangmanGame();

                while (!game.isOver()) {
                        System.out.println("Текущее слово:");
                        game.showWord();
                        System.out.println("Осталось жизней: " + game.getLives());

                        System.out.print("Введите букву: ");
                        char guess = sc.next().toLowerCase().charAt(0);

                        if (game.checkLetter(guess)) {
                                System.out.println("Угадали!");
                        } else {
                                System.out.println("Не угадали...");
                        }
                }

                if (game.isWon()) {
                        System.out.println("Победа! Загаданное слово: " + game.getWord());
                } else {
                        System.out.println("Вы проиграли. Слово было: " + game.getWord());
                }
                sc.close();
        }
}
