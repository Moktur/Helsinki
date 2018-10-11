
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int count = 0;
        int numberChoose = -1;
        
        while (numberChoose != numberDrawn) {
            System.out.println("Guess a number: ");
            numberChoose = Integer.parseInt(reader.nextLine());
            ++count;
            if (numberChoose < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + count);
            } else if (numberChoose > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + count);
            }
        }
        System.out.println("Congratulations, your number is correct!");
        
        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
