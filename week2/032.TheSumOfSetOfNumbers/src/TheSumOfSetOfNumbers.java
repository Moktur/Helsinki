
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int a = Integer.parseInt(reader.nextLine());
        int b = 0;
        int h = 0;
        while (h <= a) {
            
            b += h;
            ++h;
        }
        System.out.println("Sum is " + b);
    }
}
