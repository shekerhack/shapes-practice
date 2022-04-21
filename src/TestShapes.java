import java.util.ArrayList;

/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */
import java.util.Scanner;
public class TestShapes {
    public static void main(String[] args) {

        /*
        This will be our actual program that we request some information from user to create 3 objects
        We will create 1 Rectangle, 1 Square and 1 Circle object

        Information to create objects will be as below
         -width of the rectangle = 5.5
         -height of the rectangle = 6
         -side of the square = 2.5
         -radius of the circle = 4


         Then print each object
         And print area and perimeters of each object
         Find and print the object which has the largest area

         EXPECTED OUTPUT:
         Circle{radius=4.0}
         Area of the Circle is = 50.24
         Perimeter of the Circle is = 25.12

         Rectangle{width=5.5, height=6.0}
         Area of the Rectangle is = 33.0
         Perimeter of the Rectangle is = 23.0

         Square{side=2.5}
         Area of the Square is = 6.25
         Perimeter of the Square is = 10.0

         Circle has the largest area as 50.24
         */

        Scanner userShapeInfo = new Scanner(System.in);

        System.out.println("What is the width of the rectangle?");
        double width = userShapeInfo.nextDouble();

        System.out.println("What is height of the rectangle?");
        double height = userShapeInfo.nextDouble();

        System.out.println("What is the side of the square?");
        double side = userShapeInfo.nextDouble();

        System.out.println("What is the radius of the circle?");
        double radius = userShapeInfo.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        Square square = new Square(side);
        Circle circle = new Circle(radius);

        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(rectangle);
        shapeList.add(square);
        shapeList.add(circle);

        double largestArea = Integer.MIN_VALUE;
        Shape largestShapeAres = null;

        for(Shape shapes : shapeList){
            System.out.println("\n" + shapes);
            System.out.println("Area of the " + shapes.getClass().getSimpleName() + " is = " + shapes.area());
            System.out.println("Parameter of the " + shapes.getClass().getSimpleName() + " is = " + shapes.perimeter());
            if(shapes.area() > largestArea){
                largestArea = shapes.area();
                largestShapeAres = shapes;
            }
        }

        System.out.println("\n" + largestShapeAres.getClass().getSimpleName() + " has the largest area as " + largestArea);

    }
}
