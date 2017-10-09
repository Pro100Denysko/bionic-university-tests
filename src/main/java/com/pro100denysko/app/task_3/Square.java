package com.pro100denysko.app.task_3;

import lombok.Data;

public
@Data
class Square implements Figure {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public double getSquare() {
        return a * a;
    }
}
