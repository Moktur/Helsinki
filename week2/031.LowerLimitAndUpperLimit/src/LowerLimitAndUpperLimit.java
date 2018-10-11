
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first;
        int second;
        System.out.println("First: ");
        first = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second: ");
        second = Integer.parseInt(reader.nextLine());
        
        while (first <= second) {
            System.out.println(first);
            ++first;
        }
       
        
        // write your code here

    }
}
