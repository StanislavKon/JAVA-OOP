package Homeworks.HW_1;

public class Program {
    public static void main(String[] args) {
        Goods milk = new Milk("Молоко 'Домик в деревне'", 87.0, 10,
                "шт", "7 дней", 3.5, 1.5);
        Goods bread = new Bread("Хлеб 'Знатный'", 43.5, 10,
                "шт", "3 мес", "зерновой");
        Goods eggs = new Eggs("Яйца 'Для завтрака'", 87.90, 10,
                "шт", "3 мес", 10);
        Goods lemonade = new Lemonade("Лимонад 'Дюшес'", 45.50, 10,
                "шт", 1.5);
        Goods nipple = new Nipple("Соска 'Малыш'", 345.87,
                200, "шт", 0, "да");
        Goods diapers = new Diapers("Подгузники 'Meris'", 1087.50, 5,
                "шт", 0, "да", "XS", 3, 4);
        Goods masks = new Masks("Маски", 150.0, 100, "шт", 10);
        Goods paper = new ToiletPaper("Туалетная бумага 'Мягкий знак'", 109.0,
                20, "шт", 4, 2);

        Goods[] goods = {milk, bread, eggs, lemonade, nipple, diapers, masks, paper};
        showGoods(goods);

    }
    static void showGoods(Goods [] goods){
        System.out.println("============== ТОВАРЫ ===================\n");
        for (Goods item: goods) {
            System.out.println(item);
        }
    }
}