
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

//        System.out.println("Type your name: ");
//        String name = reader.nextLine();
//        System.out.println("Number of characters: " + firstCharacter(name));
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        if (name.length() > 2) {
            System.out.println("1. character: " + name.charAt(0));
            System.out.println("2. character: " + name.charAt(1));
            System.out.println("3. character: " + name.charAt(2));

        }
    }

//    public static char firstCharacter(String text) {
//        return text.charAt(0);
//    }
}
