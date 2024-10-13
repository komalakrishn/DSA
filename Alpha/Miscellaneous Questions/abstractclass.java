public class abstractclass {
    static abstract class shape{
        String shapename ;
        abstract double area();

        abstract double perimeter();
    }
    static class square extends shape{
        double side ;

        square(double side){
            this.side = side ;
            this.shapename = "square";
        }
        @Override
        double area() {
            double area = side * side;
            return area;
        }

        @Override
        double perimeter() {
            double perimeter = side *4;
            return perimeter;
        }

    }
    static class circle extends shape{
        double radius;
        
        circle(double radius){
            this.radius = radius;
            this.shapename = "circle";
        }
        @Override
        double area() {
            return radius*radius*Math.PI;
        }

        @Override
        double perimeter() {
            return 2*radius*Math.PI;
        }
        
    }

    static class rectangle extends shape{
        double length ; 
        double width ;

        rectangle(double length , double width ){
            this.length = length;
            this.width = width ;
            this.shapename = "rectangle";
        }

        
        double area() {
            return length * width;
        }

        @Override
        double perimeter() {
            return 2*(length + width);
        }
        
    }

    public static void main(String args[]){
        shape square = new square(4);
        System.out.println(square.shapename + " Area: " + square.area());
        System.out.println(square.shapename + " Perimeter: " + square.perimeter());
        shape rectangle = new rectangle(3,4);
        System.out.println(rectangle.shapename + " Area: " + rectangle.area());
        System.out.println(rectangle.shapename + " Perimeter: " + rectangle.perimeter());
        shape circle = new circle(5.5);
        System.out.println(circle.shapename + " Area: " +circle.area());
        System.out.println(circle.shapename + " Perimeter: " + circle.perimeter());
    }
}
