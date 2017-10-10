package com.pro100denysko.app.task_1;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public
@Data
class FishUtil {

    List<FishSale> listOfFishes = new ArrayList<>();

    public static void sort(List<FishSale> listOfFishes) {
        try {
            Collections.sort(listOfFishes, new Comparator<FishSale>() {
                @Override
                public int compare(FishSale o1, FishSale o2) {
                    return o1.getNameOfFish().compareTo(o2.getNameOfFish());
                }
            });

            for (int i = 0; i < listOfFishes.size(); i++) {
                System.out.println(listOfFishes.get(i).getNameOfFish() + " income = " + listOfFishes.get(i).incomeStatement(listOfFishes.get(i)));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
