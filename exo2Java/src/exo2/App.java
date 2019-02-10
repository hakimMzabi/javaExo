package exo2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("how many you want lunch");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        De d1 = new De(2);
        De d2 =  new De(3);
        for(int i =0 ; i < n ;i ++){
            d1.launch();

            d2.launch();
            System.out.println("d1:"+" "+ d1.getValue()+" "+d1.game(d2));
            System.out.println("d2:"+" "+d2.getValue());
        }

    }
}
