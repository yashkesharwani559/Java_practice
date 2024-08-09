public class P3 {
    public static void main(String[] args) {
        
        System.out.println(1);

        try{
            if(args.length == 0){
                MyMissingException3 x = new MyMissingException3("No input from command line");
                throw x;
            }
        }catch(MyMissingException3 e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        
    }
}

class MyMissingException3 extends RuntimeException{
    MyMissingException3(){

    }

    MyMissingException3(String message) {
        super(message);
    }
}

//output

// 1
// MyMissingException3: No input from command line
// No input from command line


//points

// Static methods are registered to the Class class object whereas instance methods are registered to the class object. 

// public String getMessage() is a method in the Throwable class that is used to get the Message of an exception

// In java.lang package  Throwable, Exception, Error , ClassNotFoundException are there
