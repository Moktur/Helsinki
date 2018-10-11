
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        String reverse = "";
        int j = name.length();
        while (i < name.length()) {
            reverse += name.charAt(j-1);
            
            ++i;
            --j;
        }
        System.out.println("In reverse order: " + reverse);
    }
}
