package test;

import shape.Rectangle;

public class RectangleTest {

    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        rectangle.resize();
        System.out.println(rectangle.toString());
    }
}
