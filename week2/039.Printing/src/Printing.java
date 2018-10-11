
public class Printing {

    public static void printStars(int amount) {
        String s = "";
        int i = 0;
        while (i < amount) {
            s += "*";
            ++i;
        }
        System.out.println(s);
    }

    public static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize) {
            printStars(sideSize);
            ++i;
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            ++i;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        if (size != 0) {
            while (i < size) {
                printStars(++i);
            }
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(5);
        System.out.println("\n---");
    }

}
