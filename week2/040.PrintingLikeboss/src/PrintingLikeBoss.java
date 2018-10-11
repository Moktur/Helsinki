
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        String s = "";
        int i = 0;
        while (i < amount) {
            s += "*";
            ++i;
        }
        System.out.println(s);
    }

    public static void printWhitespaces(int amount) {
        String s = "";
        for (int i = 0; i < amount; ++i) {
            s += " ";
        }
        System.out.print(s);
    }

    public static void printTriangle(int size) {
        int i = 0;
        int j = size -1;
        if (size >= 0) {
            while (i < size) {
                printWhitespaces(j--);
                printStars(++i);
            }
        }
    }

    public static void xmasTree(int height) {
        int s = 1;
        int j = height - 1;
        int i = 0;
        while (i < height) {
            printWhitespaces(j--);
            printStars(s);
            s += 2;
            ++i;
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
