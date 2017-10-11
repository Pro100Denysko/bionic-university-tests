package com.pro100denysko.app.task5;

public class Calculator {
    interface IntegerMath {
        //Метод интерфейса, который принимает 2 переменные
        int operation(int a, int b);
    }

    //Метод, который принимает 2 переменные и экземпляр интерфейса
    public int operateBinary(int a, int b, IntegerMath op) {
        //Метод возвращает экземпляр op, который в свою очередь принимает 2 переменные из сигнатуры operateBinary
        return op.operation(a, b);
    }

    public static void main(String... args) {
        //Создаем экземпляр класс Calculator
        Calculator myApp = new Calculator();
        //переменные addition и subtraction с помощью лямбда выражений соответственно присваивается операции добавления и отнимания
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;

        //Присвоение значений операциям и вывод на консоль
        System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
    }
}