package Homeworks.HW_2;

public abstract class Pets extends Animal implements MakesSound, ShowAffection {
    // 1.1 Кличка
    //1.2 Порода
    //1.3 Наличие прививок
    //1.4 Цвет шерсти
    //1.5 Дата рождения
    protected String name;
    protected String breed;
    protected String vaccination;
    protected String woolColor;
    protected String dataBirth;

    public Pets(double growth, double weight, String eyeColor, String name, String breed,
                String vaccination, String woolColor, String dataBirth) {
        super(growth, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.woolColor = woolColor;
        this.dataBirth = dataBirth;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString())
                .append(String.format("\tКличка: %s;\n" +
                        "\tПорода: %s;\n\tПрививки: %s;\n\tЦвет шерсти: %s;\n" +
                        "\tДата рождения: %s;\n", name, breed, vaccination,
                        woolColor,dataBirth)).toString();
    }
}