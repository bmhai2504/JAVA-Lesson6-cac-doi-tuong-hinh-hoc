public class Triangle extends  Shape{
    private double side1 = 1, side2 = 1, side3 = 1;

    public Triangle(){

    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(String color, boolean filled, double side1, double side2, double side3){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        double halfPerimeter = (getPerimeter())/2;
        double areaTriangle = Math.sqrt(halfPerimeter * (halfPerimeter - this.side1) * (halfPerimeter - this.side2) * (halfPerimeter - this.side3));
        return areaTriangle;
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle{ side1 = " + getSide1() + ", side2 = " + getSide2() + ", side3 = " + getSide3() + " }";
    }
}

