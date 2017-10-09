package com.pro100denysko.app.task_3;

public class Circle implements Figure {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public double getSquare() {
        return Math.PI*r*r;
    }
}
