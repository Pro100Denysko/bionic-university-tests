package com.pro100denysko.app.task_2;

import lombok.Data;

public
@Data
class Document {

    private String title;
    private String text;

    public Document(String title, String text) {
        this.title = title;
        this.text = text;
    }
}
