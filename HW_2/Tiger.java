package Homeworks.HW_2;

public class Tiger extends WildAnimal implements MakesSound {

    public Tiger(double growth, double weight, String eyeColor, String habitat, String dataBirth) {
        super(growth, weight, eyeColor, habitat, dataBirth);
    }

    @Override
    public void makesSound() {
        System.out.println("Ррррррыыыы");
    }
}