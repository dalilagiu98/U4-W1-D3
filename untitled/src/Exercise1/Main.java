package Exercise1;

import entities.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3.2, 4.3);
        Rectangle rectangle2 = new Rectangle(2.5,3.8);

        System.out.println("Details of first rectangle:");
        Rectangle.printRectangle(rectangle1);

        System.out.println("Details of second rectangle:");
        Rectangle.printRectangle(rectangle2);

        System.out.println("Details of both rectangles:");
        Rectangle.printRectangles(rectangle1, rectangle2);
    }
}