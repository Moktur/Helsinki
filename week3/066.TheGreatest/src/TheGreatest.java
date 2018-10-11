
import java.util.ArrayList;

public class TheGreatest {

    public static int greatest(ArrayList<Integer> list) {
        int b = list.get(list.size() - 1);
        
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > b) {
                b = list.get(i);
            }
        }
        return b ;
    }
    

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("The greatest number is: " + greatest(lista));
    }
}
