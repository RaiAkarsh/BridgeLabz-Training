import java.util.*;

public class MealMain {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        List<MealPlan> meals = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add Vegetarian Meal");
            System.out.println("2.Add Vegan Meal");
            System.out.println("3.Add Keto Meal");
            System.out.println("4.Prepare All Meals");
            System.out.println("5.Exit");

            int choice = x.nextInt();
            x.nextLine();

            switch (choice) {

                case 1:
                    Meal<VegetarianMeal> veg =
                        new Meal<>(new VegetarianMeal());
                    meals.add(veg.getMealPlan());
                    break;

                case 2:
                    Meal<VeganMeal> vegan =
                        new Meal<>(new VeganMeal());
                    meals.add(vegan.getMealPlan());
                    break;

                case 3:
                    Meal<KetoMeal> keto =
                        new Meal<>(new KetoMeal());
                    meals.add(keto.getMealPlan());
                    break;

                case 4:
                    MealUtil.prepareAll(meals);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
