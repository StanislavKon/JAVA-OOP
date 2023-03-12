package Homeworks.HW_1;

public class ChildrenGoods extends Goods{
    Integer minAge;
    String hypoallergenic;

    public ChildrenGoods(String name, Double price, Integer amount, String unit,
                         Integer minAge, String hypoallergenic) {
        super(name, price, amount, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString())
                .append(String.format("\tМинимальный возраст, мес.: %d;\n" +
                "\tГипоаллергенность: %s;\n", minAge, hypoallergenic)).toString();
    }
}