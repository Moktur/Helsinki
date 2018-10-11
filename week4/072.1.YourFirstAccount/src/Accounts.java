
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        
        
        Account pepesAcc = new Account("Pepe", 100.0 );
        pepesAcc.deposit(20);
        System.out.println(pepesAcc);
    }

}
