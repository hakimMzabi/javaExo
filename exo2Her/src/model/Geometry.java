package model;

public abstract class Geometry {


    public enum form {RECTENGLE, CAREE, CERCLE, ELLIPSE, SPHERE, CYLINDRE};
    private form f;

    abstract double area();

}
