package Homeworks.HW_3;

public class Program {
    public static void main(String[] args) throws Exception {
        Figures figures = new Figures();
        figures.addFigure(new Rectangle(10, 5));
        figures.addFigure(new Square(10));
        figures.addFigure(new Triangle(10, 12, 15));
        figures.addFigure(new Circle(10));
        figures.addFigure(new Circle(15));

        figures.showAll();
        System.out.println("=================================================================\n");
        System.out.println("Удалим последнюю фигуру, заменим фигуру круг с радиусом 10 на " +
                "круг с радиусом 15, отсортируем фигуры по площади:");
        figures.removeFigure(5);
        figures.setFigure(4, new Circle(15));
        figures.sortBySquare();

        figures.showAll();

        figures.addFigure(new Circle(0));


    }
}