
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int [] eins = {1,2,3,4,5};
        int [] zwei = reverseCopy(eins);
        eins[0] = 99;
        System.out.println("original: " + Arrays.toString(eins));
        System.out.println("kopie: " + Arrays.toString(zwei));
    }

    public static int[] copy(int[] array) {
        int[] copiedAr = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            copiedAr[i] = array[i];
        }

        return copiedAr;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] reverAr = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; --i) {
            reverAr[j] = array[i];
            ++j;
        }
        return reverAr;
    }
}
