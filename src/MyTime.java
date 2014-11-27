
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David Sanchez
 */
public class MyTime {
    public boolean earlier(ArrayList<Integer> t1,ArrayList<Integer> t2){
       if (t1.get(0)<t2.get(0))
       {
           return true;
       }
       if (t1.get(0) == t2.get(0) && t1.get(1) < t2.get(1))
       {
           return true;
       }
       return false;
   }
   
}
