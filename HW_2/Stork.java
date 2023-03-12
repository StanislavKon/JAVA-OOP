package Homeworks.HW_2;

public class Stork extends Birds implements MakesSound, Fly{
    protected Stork(double growth, double weight, String eyeColor) {
        super(growth, weight, eyeColor, 2500.0);
    }

    @Override
    public void makesSound() {
        System.out.println("Я стучу клювом тук тук и шиплю");
    }

    @Override
    public void fly() {
        System.out.printf("Я лечу на высоте %.2f метрах", getFlightAltitude());
    }
}