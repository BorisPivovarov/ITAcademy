package Lesson21;

import java.math.BigDecimal;

public class Refactoring {

    private String name;
    private String color;
    private BigDecimal price;
    private int size;

    public Refactoring(String name, String color, BigDecimal price, int size) {
        print();
    }

    public void print() {
        System.out.println("вызвать печать");
    }


}
