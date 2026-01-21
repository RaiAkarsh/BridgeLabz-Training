import java.util.*;
interface MealPlan {
    String getType();
    void prepare();
}

class VegetarianMeal implements MealPlan {
    public String getType() {
        return "Vegetarian";
    }

    public void prepare() {
        System.out.println("Preparing Vegetarian Meal");
    }
}

class VeganMeal implements MealPlan {
    public String getType() {
        return "Vegan";
    }

    public void prepare() {
        System.out.println("Preparing Vegan Meal");
    }
}

class KetoMeal implements MealPlan {
    public String getType() {
        return "Keto";
    }

    public void prepare() {
        System.out.println("Preparing Keto Meal");
    }
}


class Meal<T extends MealPlan> {

    private T mealPlan;

    Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    T getMealPlan() {
        return mealPlan;
    }
}
class MealUtil {
    static void prepareAll(List<? extends MealPlan> meals) {

        for (MealPlan m : meals) {
            System.out.print(m.getType() + " -> ");
            m.prepare();
        }
    }
}
