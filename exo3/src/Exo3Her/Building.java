package Exo3Her;

public abstract class Building {
    protected String owner;
    protected String address;
    protected double area;

    public Building(String o, String a, double area){
        this.owner = o;
        this.address = a;
        this.area = area;
    }



    abstract double tax();
    abstract void print();
}
