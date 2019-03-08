package ToyStore;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner{
    public static void main( String args[] ){
         Scanner key = new Scanner(System.in);
         ToyStore toys = new ToyStore();
         
        out.print("Add some Toy Names: ");
        while(key.hasNext()){
            String toy = key.nextLine();
             toys.loadToys(toy);   
        }
    }
}