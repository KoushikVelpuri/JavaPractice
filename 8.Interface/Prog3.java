interface Comp {
    public static final String name = "KKCC INFO SYSTEMS";
}

interface Area extends Comp {
    public float getArea(float arg1, float arg2);
}

class Rectangle implements Area {
    @Override
    public float getArea(float l, float w) {
        return (l * w);
    }
}

class Circle implements Area {
    @Override
    public float getArea(float r, float r1) {
        return (3.1416f * r * r);
    }
}

class Prog3 {
    public static void main(String args[]) {
        Area rectangle = new Rectangle();
        Area circle = new Circle();
        float a;
        a = rectangle.getArea(5, 6);
        System.out.println("Rectangle Area = " + a);
        System.out.println("Object Name=" + rectangle.name);
        a = circle.getArea(4.56f, 4.56f);
        System.out.println("Circle Area = " + a);
        System.out.println("Object Name=" + circle.name);
    }
}