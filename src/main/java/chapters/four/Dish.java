package chapters.four;

record Dish(String name, boolean vegetarian, int calories, Type type) {

  enum Type {MEAT, FISH, OTHER}
}
