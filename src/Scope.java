
public class Scope {
    public static void main(String args[]){
        int x;//knjown to all cod in the main
        x=10;
        if (x==10){//start new scope
            int y=20;// known only to this block
            System.out.println("x and y:"+x+","+y);
            x=y*2;
            
        }
    System.out.print("x is :"+x);
    
    
    
    }
    
    
    

}
