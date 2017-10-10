package com.pro100denysko.app.task_2;

import lombok.Data;

public
@Data
class WikiArticle extends Document {

    private String link;

    public WikiArticle(String title, String text, String link) {
        super(title, text);
        this.link = link;
    }
}
