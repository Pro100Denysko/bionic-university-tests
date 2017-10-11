package com.pro100denysko.app.task_1;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Data
public class FishUtil {

    private List<FishSale> listOfFishes = new ArrayList<>();

    public static void sort(List<FishSale> listOfFishes) {
        try {
            Collections.sort(listOfFishes, Comparator.comparing(FishSale::getNameOfFish));
            for (FishSale listOfFish : listOfFishes) {
                System.out.println(listOfFish.getNameOfFish() + " income = " + listOfFish.incomeStatement(listOfFish));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
