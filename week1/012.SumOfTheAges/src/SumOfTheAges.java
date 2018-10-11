
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String a = reader.nextLine();
        System.out.println("Type your age: ");
        int b = Integer.parseInt(reader.nextLine());
        System.out.println("Type your name: ");
        String c = reader.nextLine();
        System.out.println("Type your age: ");
        int d = Integer.parseInt(reader.nextLine());
        // Implement your program here
        System.out.println(a + " and " + c + " are " + (b + d) + " years old in total.");
    }
}
