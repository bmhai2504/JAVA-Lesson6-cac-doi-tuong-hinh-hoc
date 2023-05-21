public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);


        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2);
        System.out.println(circle);

        circle = new Circle("indigo", false, 5);
        System.out.println(circle);


        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3,4);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", false, 5, 6);
        System.out.println(rectangle);


        Square square = new Square();
        System.out.println(square);

        square = new Square(7);
        System.out.println(square);

        square = new Square("yello", false, 8);
        System.out.println(square);

        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.getArea());
        System.out.println(triangle);
    }
}