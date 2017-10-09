package com.pro100denysko.app.task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> list = new ArrayList<>();

        list.add(new Square(3));
        list.add(new Rectangle(4, 6));
        list.add(new Circle(4));
        double generalSquare = 0;

        for (int i = 0; i < list.size(); i++) {
            double square = list.get(i).getSquare();
            generalSquare = +square;
        }
        System.out.println(generalSquare);
    }
}
