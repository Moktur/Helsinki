
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>(7);
        System.out.println("Größe: " + numbers.size());
        for (int i = 0; i < 7 ; ++i ) {
            int l = ((random.nextInt(39) + 1 ));
            
            if (!this.containsNumber(l)) {
                numbers.add(l);
            } else {
                --i;
            }
            
        }    
        System.out.println("Größe: " + numbers.size());

    }
    // reine Überprüfung ob eine Nummer schon vorhanden ist
    public boolean containsNumber(int number) {
        return (numbers.contains(Integer.valueOf(number)));
    }
}
