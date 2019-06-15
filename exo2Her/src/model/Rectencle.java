package model;

public class Rectencle extends Geometry2D {
    private int l;
    private int h;

    public Rectencle(int l, int h) {
        this.l = l;
        this.h = h;
    }

    @Override
    double perimetre() {
        return 2*(l+h);
    }

    @Override
    double area() {
        return l*h;
    }

}
