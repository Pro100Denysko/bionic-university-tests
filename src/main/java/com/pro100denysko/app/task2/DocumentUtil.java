package com.pro100denysko.app.task2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DocumentUtil {

    private List<Document> list = new ArrayList<>();

    public static void findKeyWords(List<Document> list) {
        int limitOfString = 50;
        try {
            for (int i = 0; i < list.size(); ++i) {
                for (int k = i + 1; k < list.size(); ++k) {
                    if (list.get(i).getText().equals(list.get(k).getText())) {
                        String stringFromCycle = list.get(i).getText();
                        String substring = stringFromCycle.length() > limitOfString ? stringFromCycle.substring(0, limitOfString) + "..." : stringFromCycle;
                        System.out.println("Dublicated: " + substring);
                    }
                    if (list.get(i).getTitle().equals(list.get(k).getTitle())) {
                        String stringFromCycle = list.get(i).getTitle();
                        String substring = stringFromCycle.length() > limitOfString ? stringFromCycle.substring(0, limitOfString) + "..." : stringFromCycle;
                        System.out.println("Dublicated: " + substring);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
