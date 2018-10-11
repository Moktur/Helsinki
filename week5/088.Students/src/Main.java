
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student pepe = new Student("Pepe Peins", "123456");
        Student katha = new Student("Katha Kath", "234567");
        Scanner scanner = new Scanner(System.in);
        
        
        
        ArrayList<Student> list = new ArrayList<Student>();
    
        while (true) {
            String name, number;
            System.out.println("name: ");
            name = scanner.nextLine();
            if (name.equals("")) {
                break;
            } 
            System.out.println("number: ");
            number = scanner.nextLine();
            list.add(new Student(name, number));
        }
        
        for (Student epx : list) {
            System.out.println(epx);
        }
        System.out.println("Give search term: ");
        String search = scanner.nextLine();
        System.out.println("Result: ");
        for (Student epx : list) {
            if (epx.getName().contains(search)) {
                System.out.println(epx);
            }
        }
        
        
    }
}
