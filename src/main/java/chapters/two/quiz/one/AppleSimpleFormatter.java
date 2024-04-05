package chapters.two.quiz.one;

import chapters.two.Apple;

public class AppleSimpleFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.weight() + "g";
    }
}
