package chapters.two.quiz.one;

import chapters.two.Apple;

public class AppleFancyFormatter implements AppleFormatter {
  @Override
  public String accept(Apple apple) {
    String characteristic = apple.weight() > 150 ? "heavy" : "light";
    return "A " + characteristic + " " + apple.color().name().toLowerCase() + " apple";
  }
}
