class Light {

 
    public static void main(String[] args) {
        // TODO code application logic here
        int lightSpeed ; //in miles per second
        long days;//as many as u want
        long seconds;// time in seconds
        long distance;//distance covered by light per second in miles
        
        lightSpeed=186000;//app speed of light in miles per second
        days=1000;
        seconds=1000*24*60*60;
        distance=lightSpeed*seconds;
        
        System.out.print("In" +days);
        System.out.print(" days distance covered by speed of light is");
        System.out.println(+distance);
                
        
        
        
        
    }
    
    

}
