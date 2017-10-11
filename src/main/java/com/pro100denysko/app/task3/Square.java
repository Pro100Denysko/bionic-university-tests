package com.pro100denysko.app.task3;

import lombok.Data;

@Data
public class Square implements Figure {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public double getSquare() {
        return a * a;
    }
}
