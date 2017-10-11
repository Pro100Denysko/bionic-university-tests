package com.pro100denysko.app.task_2;

import lombok.Data;

@Data
public class Book extends Document {

    private String autor_s;
    private String publisher;
    private String annotation;

    public Book(String title, String text, String autor_s, String publisher, String annotation) {
        super(title, text);
        this.autor_s = autor_s;
        this.publisher = publisher;
        this.annotation = annotation;
    }
}
