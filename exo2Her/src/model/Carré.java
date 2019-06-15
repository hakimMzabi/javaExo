package model;

public class Carré extends Geometry2D {

    private int h;
    private  int l;

    public Carré(int h, int l) {
        this.h = h;
        this.l = l;
    }

    @Override
    double perimetre() {
        return 0;
    }

    @Override
    double area() {
        return 0;
    }
}
