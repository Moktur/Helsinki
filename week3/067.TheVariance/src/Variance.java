import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int i = 0;
        for (Integer zahl : list) {
            i += zahl;
        }
        return i;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        // write code here
        return sum(list) / (double) list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double avg = average(list);
        double var = 0;
       
        for (int i = 0; i < list.size(); i++) {
                    
                    var += Math.pow((list.get(i) - avg),2) / 
                            (list.size() - 1);
        }
        
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
