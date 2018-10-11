
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("First: ");
        a = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        b = Integer.parseInt(reader.nextLine());
        c = 0;
        while (a <= b) {
            c += a;
            a += 1;
            
        }
        System.out.println("Sum: " + c);
    }
}
