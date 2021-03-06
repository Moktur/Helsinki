
import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        Collections.addAll(list3, 10, 11);
        Collections.addAll(list1, 5);

//        Collections.addAll(list2, 5, 10, 4, 3, 7, 172, 9);
        // remove comment when method ready
        smartCombine(list3, list1);
        System.out.println(list1);
        System.out.println(list3);

    }

    public static void smartCombine(ArrayList<Integer> list1,
            ArrayList<Integer> list2) {

        for (int i = 0; i < list2.size(); ++i) {
            if (!list1.contains(list2.get(i))) {
                list1.add(list2.get(i));
            }
        }
    }
}
