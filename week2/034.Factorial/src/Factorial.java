import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        int n = 1;
        int c = 1;
        System.out.println("Type a number: ");
        number = Integer.parseInt(reader.nextLine());
        
        while (n <= number && number != 0) {
            c *= n;
            ++n;
        }
        if (number == 0) {
            c = 1;
        }
        System.out.println("Factorial is: " + c);
    }
}
