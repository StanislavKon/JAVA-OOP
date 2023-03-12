package Homeworks.HW_1;

public class Bread extends Food{
    String typeBread;

    public Bread(String name, Double price, Integer amount, String unit,
                 String expirationDate, String typeBread) {
        super(name, price, amount, unit, expirationDate);
        this.typeBread = typeBread;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString())
                .append(String.format("\tТип хлеба: %s;\n", typeBread)).toString();
    }
}