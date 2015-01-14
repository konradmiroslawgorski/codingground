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
        places.add(0);
        places.add(1);
        for (int x: places){
            fieldsA[x%dimX][x/dimY]=1;
        }
        System.out.println("Hello World from Live: "+fieldsA[1][2]);
    }
    public void liveStep(){
       for (int x=0;x<dimX;x++){
            for (int y=0;y<dimY;y++){
                int ncount = checkArea(x,y);
                if (ncount != 0) 
                    System.out.println("ncount: "+ncount+"|"+x+"|"+y);
                if(fieldsA[x][y] == 0){
                    if (ncount>2 && ncount<4) fieldsA[x][y]=1;
                }else {
                   if (ncount==0 || ncount>3) fieldsA[x][y]=0; 
                }
            }
            
        } 
    }
    public int checkArea(int x, int y){
        int res = 0;
       for (int i=x-1; i<=x+1;i++) {
           System.out.println("i: "+i);
           if (i<0 || i>=dimX || i==x) continue;
           for (int k=y-1; k<=y+1;k++) {
               System.out.println("k: "+k);
                if (k<0 || k>=dimY || k==y) continue;  
                if (fieldsA[i][k]==1) res++;
           }
       }
       return res;
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