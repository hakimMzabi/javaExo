package Exo3Her;

public class Villa extends Building {
    private int roomCounter;
    private boolean swimmingPool;

    public Villa(String o, String a, double area) {
        super(o, a, area);
    }

    @Override
    int tax() {
        int taxs = 0;
        for(int i = 0 ; i < roomCounter; i++ ){
            taxs = 100 * i;
        }
        if(swimmingPool){
            taxs = taxs + 750;
        }
        return taxs;
    }

    @Override
    void print() {
        this.toString();

    }
}
