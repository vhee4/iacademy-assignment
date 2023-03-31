public class shapeTest {
    public static void main(String[] args){
    Shape circle = new Shape();
    circle.setRadius(7);
        System.out.printf("Area of a circle is %.2f\nPerimeter of a circle is %.2f\n", circle.areaOfCircle(), circle.perOfCircle());

    Shape triangle = new Shape();
    triangle.setBase(34);
    triangle.setHeight(44);
    triangle.setLength(22);
        System.out.printf("Area of a triangle is %.2f\nPerimeter of a triangle is %.2f\n", triangle.areaOfTriangle(), triangle.perOfTriangle());
    Shape square = new Shape();
    square.setLength(88);
        System.out.printf("Area of square is %.2f\nPerimeter of square is %.2f\n", square.areaOfSquare(), square.perOfSquare());
    }

}
