package com.pro100denysko.app.task_3;

import com.pro100denysko.app.task_1.FishSale;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ///////////////////////////////////
        // TODO Task 3


        List<Figure> listOfFigures = new ArrayList<>();

        listOfFigures.add(new Square(3));
        listOfFigures.add(new Rectangle(4, 6));
        listOfFigures.add(new Circle(4));
        double generalSquare = 0;

        for (int i = 0; i < listOfFigures.size(); i++) {
            double square = listOfFigures.get(i).getSquare();
            generalSquare = +square;
        }
        System.out.println(generalSquare);


        ///////////////////////////////////
        // TODO Task 1

        List<FishSale> listOfFishes = new ArrayList<>();

        listOfFishes.add(new FishSale("Clown Fish", 200.0, "7.25.2017", 400.0, "7.30.2017", 2, 1.5));
        listOfFishes.add(new FishSale("Clown Fish", 200.0, "7.25.2017", 400.0, "7.26.2017", 2.3,1.5));
        listOfFishes.add(new FishSale("Carp", 150.0, "11.06.2017", 250.0, "12.12.2017", 1.5,2));
        listOfFishes.add(new FishSale("Carp", 150.0, "11.06.2017", 250.0, "12.24.2017", 2,2));
        listOfFishes.add(new FishSale("Trout", 400.0, "06.10.2017", 800.0, "06.15.2017", 4,3));

        Collections.sort(listOfFishes, new Comparator<FishSale>() {
            @Override
            public int compare(FishSale o1, FishSale o2) {
                return o1.getNameOfFish().compareTo(o2.getNameOfFish());
            }
        });

        for (int i = 0; i < listOfFishes.size(); i++) {
            System.out.println(listOfFishes.get(i).getNameOfFish() + " income = " + listOfFishes.get(i).incomeStatement(listOfFishes.get(i)));
        }
    }
}
