public class T {
    {
        System.out.println("Instance");
    }

    T(){
        System.out.println("constructor");
    }

    public static void main(String[] args ){
        T x = new T();
    }
}

//this will print output as
// Instance
// constructor

//so instance block have priority greater than the code that we have written in the constructor
