package ToyStore;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore{
    private ArrayList<Toy> toyList;
    public ToyStore(){
        toyList = new ArrayList<Toy>();
    }
    
    public void loadToys( String toys ){
         if (newToy(toys)){
             toyList.add(new Toy (toys));
         }
        out.println(toyList);
        System.out.println(getMFT());
    }
    
    public void countAddToy(int n){
         int cnt = toyList.get(n).getCount();
         toyList.get(n).setCount(cnt+1);
    }
    
    public boolean newToy( String toys){
         for(int n = 0; n <toyList.size(); n++){
            if (toys.toLowerCase().equals(toyList.get(n).getName().toLowerCase())){
                countAddToy(n);
                return false;
            }
          }
         return true;
    }
    
    public String getMFT(){
         int max = toyList.get(0).getCount();
         for (int i = 1; i < toyList.size(); i++){
            max = Math.max(max, toyList.get(i).getCount());
        }
        for(int j = 0; j< toyList.size(); j++){
            if(toyList.get(j).getCount() == max){
                return toyList.get(j).getName();
            }
        }
        return "";
    }
    
    public void SBC(){
        
    }
    
    public String toString(){
        return "";
    }
}