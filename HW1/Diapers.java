package Homeworks.HW_1;

public class Diapers extends ChildrenGoods{

    String size;
    Integer minWeight;
    Integer maxWeight;

    public Diapers(String name, Double price, Integer amount, String unit, Integer minAge,
                   String hypoallergenic, String size, Integer minWeight, Integer maxWeight) {
        super(name, price, amount, unit, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString())
                .append(String.format("\tРазмер: %s;\n\tМин. вес: %d кг;\n" +
                        "\tМакс. вес: %d кг;\n", size, minWeight, maxWeight)).toString();
    }
}