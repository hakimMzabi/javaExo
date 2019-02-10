package exo2;

import java.util.Random;

public class De {
    private int value;

    public De(int val){
        this.value = val;
    }

   public void launch(){
       Random rand = new Random();
       this.value = rand.nextInt(6) + 1;

   }

   public int getValue(){
        return this.value;
   }

   public String game(De de){
        if (this.value == de.value){
            return "you win !!";
        }else{
            return "you lost !!";
        }
   }

}
