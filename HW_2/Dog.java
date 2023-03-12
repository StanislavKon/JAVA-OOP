package Homeworks.HW_2;

public class Dog extends Pets implements MakesSound, ShowAffection, Training {
    private String haveTraining;

    public Dog(double growth, double weight, String eyeColor, String name, String breed,
               String vaccination, String woolColor, String dataBirth, String haveTraining) {
        super(growth, weight, eyeColor, name, breed, vaccination, woolColor, dataBirth);
        this.haveTraining = haveTraining;
    }

    public String getHaveTraining() {
        return haveTraining;
    }

    @Override
    public void training() {
        System.out.println("Проходит дрессировку");
    }