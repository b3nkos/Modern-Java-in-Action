package chapters.three;

public record Apple(Integer weight, Color color, String country) {
    public Apple() {
        this(120, Color.GREEN, "Canada");
    }

    public Apple(Integer weight) {
        this(weight, Color.GREEN, "Canada");
    }

    public Apple(Color color, Integer weight) {
        this(weight, color, "Canada");
    }

    public Apple(Integer weight, Color color) {
        this(weight, color, "Canada");
    }

}
