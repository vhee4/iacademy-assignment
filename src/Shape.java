public class Shape {
private double length;
private double height;
private double width;
private double base;
private double radius;

// setter and getter
    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double areaOfCircle(){
        return ((22/7) * getRadius() * getRadius());
    }
    public double perOfCircle(){
        return 2 * 22/7 * getRadius();
    }
    public double areaOfTriangle(){
        return (0.5 * getBase() * getHeight());
    }
    public double perOfTriangle(){
        return getLength() + getHeight() + getWidth();
    }

    public double areaOfSquare(){
        return (getLength() * getLength());
    }
    public double perOfSquare(){
        return 4 * getLength();
    }

    public double areaOfRectangle(){
        return getLength() * getWidth();
    }
    public double perOfRectangle(){
        return 2 * (getLength() * getWidth());
    }


}


