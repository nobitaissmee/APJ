package test;

import shape.Circle;

public class CircleTest {

    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle);
        circle.resize();
        System.out.println(circle.toString());
    }
}
