
public class Least {

    public static int sum(int number1, int number2, int number3, int number4) {
        return (number1 + number2 + number3 + number4);
        
    }
    
    public static int least(int n1, int n2) {
        if (n1 < n2) {
            return n1;
        } else {
            return n2;
        }
        
    }
    public static void main(String[] args) {
        
        int answer =  least(2, 7);
    System.out.println("Least: " + answer);
    }
}
