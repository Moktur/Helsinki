
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        NightSky nightsky = new NightSky(8,4);
        nightsky.print();
        System.out.println(nightsky.starsInLastPrint());
        
        nightsky.print();
        System.out.println(nightsky.starsInLastPrint());
        
    }
}
