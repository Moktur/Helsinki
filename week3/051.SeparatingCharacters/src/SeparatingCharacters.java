
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int j = 1;
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        while (i < name.length()) {
            
            System.out.println(j +". character: " + name.charAt(i));
            ++i;
            ++j;
        }
    }
}
