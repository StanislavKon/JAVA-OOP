package HW_2;

public abstract class Animal {
    protected double growth;
    protected double weight;
    protected String eyeColor;

    public Animal(double growth, double weight, String eyeColor) {
        this.growth = growth;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public abstract void makesSound();
    @Override
    public String toString() {
        return String.format(new StringBuilder().append("\tРост, см: %.2f;\n")
                .append("\tВес, кг: %.2f;\n")
                .append("\tЦвет глаз: %s;\n").toString(), growth, weight, eyeColor);
    }
}