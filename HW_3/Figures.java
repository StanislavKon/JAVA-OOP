package Homeworks.HW_3;

import Homeworks.HW_2.Animal;

import java.util.ArrayList;
import java.util.Collections;

public class Figures {
    private final ArrayList<Figure> figures = new ArrayList<>();

    public void addFigure(Figure figure){
        this.figures.add(figure);
    }

    public void removeFigure(int number){
        this.figures.remove(number - 1);
    }

    public void showAll(){
        System.out.println("========== Все фигуры ============");
        for (int i = 0; i < this.figures.size(); i++) {
            System.out.print("№" + (i+1) + ". ");
            System.out.println(this.figures.get(i));
        }
    }

    public void setFigure(int number, Figure figure){
        this.figures.set(number-1, figure);
    }

    public void sortBySquare(){
        Collections.sort(this.figures);
    }
}