
public class Main {

    public static void main(String[] args) {
        MyDate datum = new MyDate(30,12,1986);
        
        System.out.println(datum);
        
        datum.advance(3);
        System.out.println(datum);
        
        MyDate NeuDatum = datum.afterNumberOfDays(5);
        
        System.out.println(datum);
        System.out.println(NeuDatum);

    }
}
