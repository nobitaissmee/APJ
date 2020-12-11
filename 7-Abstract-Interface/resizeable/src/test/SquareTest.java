package test;

import shape.Square;

public class SquareTest {

    public static void main(String[] args) {

        Square square = new Square();
        System.out.println(square);
        square.resize();
        System.out.println(square.toString());
    }
}
