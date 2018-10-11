
public class Main {

    public static void main(String[] args) {
        Money pepe = new Money(200, 0);
        Money bini = new Money(200, 10);
        
        Money pepe2 = new Money(10, 23);
        Money bini2 = new Money(9,90);
        
        
        System.out.println(pepe.less(bini));
        System.out.println(pepe2.less(bini2));
    }
}
