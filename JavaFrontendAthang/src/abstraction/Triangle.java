package abstraction;

public class Triangle extends Shape{
        @Override
    protected double getArea(int length, int width) {
        return (length*width)*0.5;
    }

    protected void normalMethod(){
        super.normalMethod();
    }
}
