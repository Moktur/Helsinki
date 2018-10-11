import java.util.Random;

public class PasswordRandomizer {
    private int length;
    Random randomizer = new Random();
    
    
    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String s = "";    
        for (int i = 0; i < length; ++i) {
                s += "abcdefghijklmnopqrstuvwxyz"
                        .charAt(randomizer.nextInt(24));
            }  
        return s;
    }
}
