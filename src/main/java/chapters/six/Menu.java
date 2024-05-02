package chapters.six;

import java.util.Arrays;
import java.util.List;

public class Menu {
  public static List<Dish> menu() {
    return Arrays.asList(
      new Dish("Pork", false, 800, Dish.Type.MEAT),
      new Dish("Beef", false, 700, Dish.Type.MEAT),
      new Dish("Chicken", false, 400, Dish.Type.MEAT),
      new Dish("French fries", true, 530, Dish.Type.OTHER),
      new Dish("Rice", true, 350, Dish.Type.OTHER),
      new Dish("Season fruit", true, 120, Dish.Type.OTHER),
      new Dish("Pizza", true, 550, Dish.Type.OTHER),
      new Dish("Prawns", false, 300, Dish.Type.FISH),
      new Dish("Salmon", false, 450, Dish.Type.FISH),
      new Dish("Spaghetti Carbonara", false, 500, Dish.Type.MEAT),
      new Dish("Vegetable Stir Fry", true, 350, Dish.Type.OTHER),
      new Dish("Grilled Salmon", false, 400, Dish.Type.FISH),
      new Dish("Chicken Curry", false, 600, Dish.Type.MEAT),
      new Dish("Caesar Salad", true, 250, Dish.Type.OTHER),
      new Dish("Tuna Sandwich", false, 320, Dish.Type.FISH),
      new Dish("Mushroom Risotto", true, 450, Dish.Type.OTHER),
      new Dish("Beef Burger", false, 700, Dish.Type.MEAT),
      new Dish("Spinach Lasagna", true, 550, Dish.Type.OTHER),
      new Dish("Fish Tacos", false, 380, Dish.Type.FISH),
      new Dish("Pasta Primavera", true, 400, Dish.Type.OTHER),
      new Dish("Grilled Steak", false, 800, Dish.Type.MEAT),
      new Dish("Quinoa Salad", true, 300, Dish.Type.OTHER),
      new Dish("Shrimp Scampi", false, 420, Dish.Type.FISH),
      new Dish("Beef Stew", false, 550, Dish.Type.MEAT),
      new Dish("Eggplant Parmesan", true, 480, Dish.Type.OTHER),
      new Dish("Salmon Teriyaki", false, 450, Dish.Type.FISH),
      new Dish("Chicken Alfredo", false, 700, Dish.Type.MEAT),
      new Dish("Greek Salad", true, 320, Dish.Type.OTHER),
      new Dish("Sushi Rolls", false, 300, Dish.Type.FISH),
      new Dish("Steak Fajitas", false, 600, Dish.Type.MEAT),
      new Dish("Caprese Salad", true, 280, Dish.Type.OTHER),
      new Dish("Lemon Garlic Shrimp", false, 380, Dish.Type.FISH),
      new Dish("Pork Chops", false, 550, Dish.Type.MEAT),
      new Dish("Vegetable Curry", true, 450, Dish.Type.OTHER),
      new Dish("Seared Tuna", false, 320, Dish.Type.FISH),
      new Dish("Beef Tacos", false, 500, Dish.Type.MEAT),
      new Dish("Vegetable Soup", true, 200, Dish.Type.OTHER),
      new Dish("Baked Cod", false, 350, Dish.Type.FISH),
      new Dish("Lamb Chops", false, 600, Dish.Type.MEAT),
      new Dish("Pasta Carbonara", false, 550, Dish.Type.MEAT),
      new Dish("Vegetable Lo Mein", true, 380, Dish.Type.OTHER),
      new Dish("Grilled Halibut", false, 420, Dish.Type.FISH),
      new Dish("Beef Stir Fry", false, 600, Dish.Type.MEAT),
      new Dish("Egg Fried Rice", true, 320, Dish.Type.OTHER),
      new Dish("Sesame Ginger Salmon", false, 400, Dish.Type.FISH),
      new Dish("Pork Ribs", false, 700, Dish.Type.MEAT),
      new Dish("Vegetable Skewers", true, 250, Dish.Type.OTHER),
      new Dish("Fish and Chips", false, 600, Dish.Type.FISH),
      new Dish("Chicken Parmesan", false, 650, Dish.Type.MEAT),
      new Dish("Vegetarian Chili", true, 400, Dish.Type.OTHER),
      new Dish("Teriyaki Chicken", false, 550, Dish.Type.MEAT),
      new Dish("Miso Soup", true, 150, Dish.Type.OTHER),
      new Dish("Salmon Caesar Salad", false, 380, Dish.Type.FISH),
      new Dish("BBQ Pulled Pork", false, 750, Dish.Type.MEAT),
      new Dish("Vegetable Pad Thai", true, 420, Dish.Type.OTHER),
      new Dish("Grilled Swordfish", false, 450, Dish.Type.FISH),
      new Dish("Beef Wellington", false, 900, Dish.Type.MEAT),
      new Dish("Vegetable Pizza", true, 320, Dish.Type.OTHER),
      new Dish("Shrimp Fried Rice", false, 400, Dish.Type.FISH),
      new Dish("Chicken Tenders", false, 500, Dish.Type.MEAT),
      new Dish("Caesar Wrap", true, 350, Dish.Type.OTHER)
    );
  }
}
