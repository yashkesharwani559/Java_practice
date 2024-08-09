public class K2 {
    static K2 k = new K2();
    public static void main(String[] args){
        
    }
    public static void pro(){
        synchronized (k.getClass()) {//correct
            
        }
    }
    
    public static void pro1(){
        synchronized (K2.class) {//correct
            
        }
    }
    
    public static void pro2() throws ClassNotFoundException{
        synchronized (Class.forName("K2")) {//correct
            
        }
    }

}

//means we can write the synchronized block inside the static method