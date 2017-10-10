package com.pro100denysko.app.task_3;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public
@Data
class FigureUtil {

    List<Figure> listOfFigures = new ArrayList<>();

    public static void generalSquare(List<Figure> listOfFigures) {
        try {


            double generalSquare = 0;

            for (int i = 0; i < listOfFigures.size(); i++) {
                double square = listOfFigures.get(i).getSquare();
                generalSquare = +square;
            }
            System.out.println("General Square = " + generalSquare);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
