
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 0};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        
        for (int i = 0; i < array.length; ++i) {
            String star = "";
            int starAnz = array[i];
            for (int j = 0; j < starAnz; ++j) {
               star += "*";
            }
            System.out.println(star);
        }
    }
}
