

public class H {

    static{
        System.out.println("static");
    }
    {
        System.out.println("instance");
    }
    
    H(){
        
        System.out.println("constructor");
    }

    public static void main(String[] args){
        H x = new H();
    }
}

//this will give output as
//static
//instance
//constructor
