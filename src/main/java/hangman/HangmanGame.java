package hangman;

import java.util.Random;

public class HangmanGame {

    private String[] words = {"java", "programming", "development", "computer", "senla", "dostoevskiy"};
    private String word;
    private char[] guessed;
    private int lives;
    private boolean won;

    public HangmanGame() {
        Random rand = new Random();
        word = words[rand.nextInt(words.length)];
        guessed = new char[word.length()];
        lives = 6;
        won = false;

        for (int i = 0; i < guessed.length; i++) {
            guessed[i] = '_';
        }
    }

    public boolean checkLetter(char letter) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessed[i] = letter;
                found = true;
            }
        }
        if (!found) {
            lives--;
        }
        if (new String(guessed).equals(word)) {
            won = true;
        }
        return found;
    }

    public boolean isWon() {
        return won;
    }

    public boolean isOver() {
        return lives == 0 || won;
    }

    public int getLives() {
        return lives;
    }

    public void showWord() {
        for (int i = 0; i < guessed.length; i++) {
            System.out.print(guessed[i] + " ");
        }
        System.out.println();
    }

    public String getWord() {
        return word;
    }
}
