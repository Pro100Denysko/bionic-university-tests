package com.pro100denysko.app;

import com.pro100denysko.app.task_1.FishSale;
import com.pro100denysko.app.task_3.Circle;
import com.pro100denysko.app.task_3.Figure;
import com.pro100denysko.app.task_3.Rectangle;
import com.pro100denysko.app.task_3.Square;
import com.pro100denysko.app.task_4.Age;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        ///////////////////////////////////
        // TODO Task 1

        System.out.println("Task 1");
        List<FishSale> listOfFishes = new ArrayList<>();

        listOfFishes.add(new FishSale("Clown Fish", 200.0, "25.7.2017", 400.0, "30.7.2017", 2, 1.5));
        listOfFishes.add(new FishSale("Clown Fish", 200.0, "25.7.2017", 400.0, "26.7.2017", 2.3, 1.5));
        listOfFishes.add(new FishSale("Carp", 150.0, "6.11.2017", 250.0, "12.12.2017", 1.5, 2));
        listOfFishes.add(new FishSale("Carp", 150.0, "6.11.2017", 250.0, "24.12.2017", 2, 2));
        listOfFishes.add(new FishSale("Trout", 400.0, "10.6.2017", 800.0, "15.6.2017", 4, 3));

        Collections.sort(listOfFishes, new Comparator<FishSale>() {
            @Override
            public int compare(FishSale o1, FishSale o2) {
                return o1.getNameOfFish().compareTo(o2.getNameOfFish());
            }
        });

        for (int i = 0; i < listOfFishes.size(); i++) {
            System.out.println(listOfFishes.get(i).getNameOfFish() + " income = " + listOfFishes.get(i).incomeStatement(listOfFishes.get(i)));
        }
        System.out.println();


        ///////////////////////////////////
        // TODO Task 3

        System.out.println("Task 3");
        List<Figure> listOfFigures = new ArrayList<>();

        listOfFigures.add(new Square(3));
        listOfFigures.add(new Rectangle(4, 6));
        listOfFigures.add(new Circle(4));
        double generalSquare = 0;

        for (int i = 0; i < listOfFigures.size(); i++) {
            double square = listOfFigures.get(i).getSquare();
            generalSquare = +square;
        }
        System.out.println("General Square = " + generalSquare);
        System.out.println();


        ///////////////////////////////////
        // TODO Task 3

        System.out.println("Task 4");

        Age age = new Age();
        age.dateOfBirth();
        age.ageInDays();
        age.ageInMonths();
        age.dayOfWeekOfBirth();

    }
}
