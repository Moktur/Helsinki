
public class Main {

    public static void main(String[] args) {
        Person pepe = new Person("pepe grz", "491622140961");
        System.out.println(pepe);
        
        
        Phonebook pb = new Phonebook();
        
        pb.add("Patrick Grzechca", "+491622140961");
        pb.add("Hans Wurst", "2342424");
        pb.add("qsdadad", "111111111111");
        
        pb.printAll();
        
        System.out.println(pb.searchNumber("Kleiner Warmpf"));
       
    }
}
