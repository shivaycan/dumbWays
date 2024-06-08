package OOPS;

class Circle {
    private float radius, area;

    float getRadius() {
        return radius;
    }

    void setRadius(float r) {
        radius = r;
    }

    float getArea() {
        return this.area;
    }

    void calculateArea() {
        area = (float) (Math.PI * Math.pow(radius, 2));
    }
}

public class getterques {
    public static void main(String args[]) {
        Circle cr = new Circle();
        cr.setRadius(6.0f);
        cr.calculateArea();

        System.out.println("Radius: " + cr.getRadius());
        System.out.println("Area: " + cr.getArea());
    }
}

