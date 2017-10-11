package com.pro100denysko.app.task3;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FigureUtil {

    private List<Figure> listOfFigures = new ArrayList<>();

    public static void generalSquare(List<Figure> listOfFigures) {
        try {
            double generalSquare = 0;
            for (Figure listOfFigure : listOfFigures) {
                double square = listOfFigure.getSquare();
                generalSquare = +square;
            }
            System.out.println("General Square = " + generalSquare);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
