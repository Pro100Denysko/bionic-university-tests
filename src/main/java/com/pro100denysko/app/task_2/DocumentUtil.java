package com.pro100denysko.app.task_2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public
@Data
class DocumentUtil {

    private List<Document> list = new ArrayList<>();

    public static void findKeyWords(List<Document> list) {
        try {
            for (int i = 0; i < list.size(); ++i) {
                for (int k = i + 1; k < list.size(); ++k) {
                    if (list.get(i).getText() == list.get(k).getText()) {
                        System.out.println("Dublicated :" + list.get(i).getText());
                    }
                    if (list.get(i).getTitle() == list.get(k).getTitle()) {
                        System.out.println("Dublicated :" + list.get(i).getTitle());
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
