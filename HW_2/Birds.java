package Homeworks.HW_2;

public abstract class Birds extends Animal implements MakesSound, Fly{
    private double flightAltitude;

    protected Birds(double growth, double weight, String eyeColor, double flightAltitude) {
        super(growth, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString())
                .append(String.format("\tВысота полета, метр: %.2f;\n", flightAltitude)).toString();
    }

    public double getFlightAltitude() {
        return flightAltitude;
    }
}