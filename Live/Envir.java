import java.util.*;
import MyPackage.*;
public class Envir{
    ArrayList<Integer> places = new ArrayList<Integer>();
    Live l;
    public Envir(){
        System.out.println("Envir");
        places.add(0);
        places.add(1);
        places.add(1*10+1);
        places.add(2*10+1);
        l = new Live(10,10,places);
        l.showLiveArea();
    }
    public void Step(){
        
    }
}