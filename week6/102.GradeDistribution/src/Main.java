
import java.util.ArrayList;
import java.util.Scanner;
//Akzeptanzformel 100*accepted/allScores

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> points = new ArrayList<Integer>();
//
//        System.out.println("Type exam scores, -1 completes:");
//        while (true) {
//            int singlePoints = Integer.parseInt(lukija.nextLine());
//            if (singlePoints == -1) {
//                break;
//            } else {
//                points.add(singlePoints);
//            }
//
//        }
//
//        printResults(gradeDistribution(points), points);
    points.add(34);
    points.add(41);
    points.add(53);
    points.add(36);
    points.add(55);
    points.add(27);
    points.add(43);
    points.add(40);
    printResults(gradeDistribution(points), points);
    
    }

    
    public static String[] gradeDistribution(ArrayList<Integer> list) {
        String[] grade = new String[6];

        for (int points : list) {

            if (points < 30 && points >= 0) {
                grade[0] += "*";

            } else if (points < 35) {
                grade[1] += "*";

            } else if (points < 40) {
                grade[2] += "*";

            } else if (points < 45) {
                grade[3] += "*";

            } else if (points < 50) {
                grade[4] += "*";

            } else if(points <= 60) {
                grade[5] += "*";

            }
        }
        return grade;
    }

    public static void printResults(String[] grade, ArrayList<Integer> list) {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ":" + grade[i]);
        }
        System.out.println("Acceptance percentage: " + countStars(grade) * 100.0 / arrayListSize(list));
    }

    public static int countStars(String[] grade) {
        int peins = 0;
        for (int i = 0; i <= 5; ++i) {
            if (grade[i] != null) {
                for (int j = 0; j < grade[i].length(); ++j) {
                    if (grade[i].charAt(j) == '*') {
                        ++peins;
                    }
                }
            }
        }
        return peins;
    }

    public static int arrayListSize(ArrayList<Integer> list) {
        return list.size();
    }
}
