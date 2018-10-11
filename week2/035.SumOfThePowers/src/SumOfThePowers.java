
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int b = 1;
        int n = 2;
        int sum = 3;
        int Zahl = 2;
        if (number == 0) {
            System.out.println("1");
        } else if (number == 1) {
            System.out.println("2");
        } else {
            while (n <= number) {
                
                while (b < n) {
                    Zahl *= 2;
                    ++b;
                }
                sum += Zahl;
                System.out.println(sum);
                ++n;
            }
        }
    }
}
