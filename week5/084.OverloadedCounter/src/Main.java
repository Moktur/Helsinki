public class Main {
    public static void main(String[] args) {
        
        Counter Nummer1 = new Counter(900,false);
        
        System.out.println(Nummer1);
        Nummer1.increase();
        
        System.out.println(Nummer1);
        
        Nummer1.decrease();
        Nummer1.decrease();
        
        System.out.println(Nummer1);
    }
}
