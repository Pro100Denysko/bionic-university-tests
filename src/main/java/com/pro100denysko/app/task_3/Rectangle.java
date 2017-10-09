package com.pro100denysko.app.task_3;

import lombok.Data;

public
@Data
class Rectangle implements Figure {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getSquare() {
        return a * b;
    }
}
