package Exercise1;

import entities.Rectangle;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a base and a height for your rectangle:");
        double base = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(base, height);
        System.out.println("Details of first rectangle:");
        Rectangle.printRectangle(rectangle);

        System.out.println("Now insert another base and height for another rectangle:");
        double baseTwo = Double.parseDouble(scanner.nextLine());
        double heightTwo = Double.parseDouble(scanner.nextLine());
        Rectangle rectangleTwo = new Rectangle(baseTwo, heightTwo);
        System.out.println("Details of second rectangle:");
        Rectangle.printRectangle(rectangleTwo);

        System.out.println("Details of both rectangles:");
        Rectangle.printRectangles(rectangle, rectangleTwo);
    }
}