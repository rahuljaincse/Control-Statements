
public class Conversion {
public static void main(String Args[]){
    byte b;
    int i=257;
    double d= 323.662;
    
    System.out.print("\n Conversions of int to byte");
    b=(byte)i;
    
    System.out.print("\n i and b"+i+","+b);
    
    System.out.print("\n Conversions of double to int");
    i=(int)d;
    
    System.out.print("\nd and i"+d+","+i);
    
    
    System.out.print("\n Conversions of double to byte");
    b=(byte)d;
    
    System.out.print("\n d and b"+d+","+b);
    
    
    
}
}
