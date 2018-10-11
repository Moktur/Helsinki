
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i = text.length() - 1;
        String s = "";
        for (int l = 0; l < text.length(); ++l) {
            s += text.charAt(i);
            --i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
