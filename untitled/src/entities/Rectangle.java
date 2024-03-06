package entities;

public class Rectangle {
    //ATTRIBUTE LIST:
    private double base;
    private double height;


    //CONSTRUCTOR LIST:

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //METHOD:
    public double areaCalculation(){
       return  base * height;
    }

    public double perimeterCalculation(){
        return (base * 2) + (height * 2);
    }

    public static void printRectangle(Rectangle rectangle) {
        System.out.println("Area: " + rectangle.areaCalculation());
        System.out.println("Perimeter: " + rectangle.perimeterCalculation());
    }

    public static void printRectangles(Rectangle rectangle1, Rectangle rectangle2) {
        System.out.println("Rectangle 1:");
        printRectangle(rectangle1);

        System.out.println("Rectangle 2:");
        printRectangle(rectangle2);

        double sumAreas = rectangle1.areaCalculation() + rectangle2.areaCalculation();
        double sumPerimeters = rectangle1.perimeterCalculation() + rectangle2.perimeterCalculation();

        System.out.println("Sum of the areas: " + sumAreas);
        System.out.println("Sum of the perimeters: " + sumPerimeters);
    }


}

