package Exo3Her;

public class Company extends Building {

    private String name;
    private int employeeCounter;
    private double avg;

    public Company(String o, String a, double area) {
        super(o, a, area);
    }

    @Override
    double tax() {
        return this.area * 6.3;
    }

    @Override
    void print() {
        this.toString();

    }
}
