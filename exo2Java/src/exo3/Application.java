package exo3;

import java.util.ArrayList;

public class Application {
    private ArrayList< ArrayList <Mark> > markList =  new ArrayList<ArrayList<Mark>>();

    public Application(){

    }
    public Application(ArrayList< ArrayList <Mark> > list){

        this.markList = list;
    }

    public void print(){
        for(ArrayList<Mark> markArrayList : markList){
            for(int i = 0 ; i< markList.size();i++){
                System.out.println(markList.get(i));
            }
        }
    }

    public float average(int pos){
        float aver = 0;
        for(ArrayList<Mark> markArrayList : markList){
            for(int i = 0 ; i< markList.size();i++){
                for(int j = 0; j <  markList.get(pos).size() ; j++){
                  aver =  (aver + markList.get(pos).get(i).getValue() ) / markList.get(pos).size();
                }

            }
        }
        return aver;
    }

    public void add(int pos, String subject,float value){

        markList.get(pos).get(pos).setSubject(subject);
        markList.get(pos).get(pos).setValue(value);

    }



}
