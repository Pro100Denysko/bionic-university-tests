package com.pro100denysko.app.task_3;

import lombok.Data;

@Data
public class Circle implements Figure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.PI * radius * radius;
    }
}
