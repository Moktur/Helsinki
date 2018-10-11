
public class Accounts {

    public static void main(String[] args) {
        
        Account acc = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        
        acc.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(acc);
        System.out.println(myAccount);
        
               
    }

}
