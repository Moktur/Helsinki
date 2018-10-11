import java.util.Scanner;
public class EvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Up to what number? ");
        int a = Integer.parseInt(scanner.nextLine());
        int b = 1;
        while (b <= a) {

            System.out.println(b);
            ++b;
        }
    }
}
