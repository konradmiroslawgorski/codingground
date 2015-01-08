package MyPackage;
import java.util.*;
public class Live{
    int dimX;
    int dimY;
    int[ ][ ] fieldsA; 
    public Live(int dimX, int dimY){
        fieldsA = new int[dimX][dimX];
        System.out.println("Hello World from Live: "+fieldsA[1][2]);
    }
    public Live(int dimX, int dimY, ArrayList<Integer> places){
        this.dimX=dimX;
        this.dimY=dimY;
        fieldsA = new int[dimX][dimX];
        for (int x: places){
            fieldsA[x%dimX][x/dimY]=1;
        }
        System.out.println("Hello World from Live: "+fieldsA[1][2]);
    }
    public void setAnimals(){
        
    }
    public void showLiveArea(){
        for (int x=0;x<dimX;x++){
            String line = "";
            for (int y=0;y<dimY;y++){
               line+= fieldsA[x][y]==1?"X":"O";
            }
            System.out.println(line);
        }
    }
}