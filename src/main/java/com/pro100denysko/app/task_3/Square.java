package com.pro100denysko.app.task_3;

public class Square implements Figure {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public double getSquare() {
        return a * a;
    }
}
