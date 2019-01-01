package exo4;

public class App {
    public static void main(String[] args) {
        Functions fn = new Functions("ACGT","AG");
        boolean test = fn.verify("ACGT","AG");
        System.out.println(test);
    }
}