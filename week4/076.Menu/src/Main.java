
public class Main {
    public static void main(String[] args) {
        Menu exactum = new Menu();

         
         exactum.addMeal("Fish fingers with sour cream sauce");
         exactum.addMeal("Vegetable casserole with salad cheese");
         exactum.addMeal("Chicken and nacho salad");
         exactum.addMeal("Fish fingers with sour cream sauce");
         exactum.printMeals();
         
         exactum.clearMenu();
         exactum.printMeals();
         

        // When you have created printMeals() method,
        // you may remove the comments below
        // exactum.printMeals();

        // When you have created clearMenu() method,
        // You may remove the comments below
        // exactum.clearMenu();
        // exactum.printMeals();
    }
}
