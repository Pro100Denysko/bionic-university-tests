package com.pro100denysko.app.task_3;

import lombok.Data;

public
@Data
class Circle implements Figure {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public double getSquare() {
        return Math.PI * r * r;
    }
}
