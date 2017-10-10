package com.pro100denysko.app.task_2;

import lombok.Data;

public
@Data
class Article extends Document {

    private String autor_s;
    private String journalName;
    private int year;
    private int n;

    public Article(String title, String text, String autor_s, String journalName, int year, int n) {
        super(title, text);
        this.autor_s = autor_s;
        this.journalName = journalName;
        this.year = year;
        this.n = n;
    }
}
