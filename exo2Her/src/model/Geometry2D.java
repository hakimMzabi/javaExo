package model;

public abstract class Geometry2D extends Geometry {

    public enum form {RECTENGLE, CAREE, CERCLE, ELLIPSE};
    abstract double perimetre();
}
