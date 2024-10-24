public class abstractclass {
    static abstract class Shape {
        protected String shapename;
        abstract double area();
        abstract double perimeter();
    }

    static class Square extends Shape {
        double side;

        Square(double side) {
            this.side = side;
            this.shapename = "Square";
        }

        @Override
        double area() {
            return side * side;
        }

        @Override
        double perimeter() {
            return 4 * side;
        }
    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
            this.shapename = "Circle";
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }

        @Override
        double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Rectangle extends Shape {
        double length;
        double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
            this.shapename = "Rectangle";
        }

        @Override
        double area() {
            return length * width;
        }

        @Override
        double perimeter() {
            return 2 * (length + width);
        }
    }

    public static void main(String[] args) {
        Shape square = new Square(4);
        System.out.println(square.shapename + " Area: " + square.area());
        System.out.println(square.shapename + " Perimeter: " + square.perimeter());

        Shape rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.shapename + " Area: " + rectangle.area());
        System.out.println(rectangle.shapename + " Perimeter: " + rectangle.perimeter());

        Shape circle = new Circle(5.5);
        System.out.println(circle.shapename + " Area: " + circle.area());
        System.out.println(circle.shapename + " Perimeter: " + circle.perimeter());
    }
}
