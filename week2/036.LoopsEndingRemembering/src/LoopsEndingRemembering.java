
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        int sum = 0;
        int count = 0;
        int countEven = 0;
        int countOdd = 0;
        double avg = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            

            System.out.println(number);

            if (number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            } else {    
                if (number % 2 == 0) {
                    ++countEven;
                } else {
                    ++countOdd;
                }
                sum += number;
                ++count;
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + (double)sum / count);
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
    }
}
