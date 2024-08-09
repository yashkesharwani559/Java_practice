public class G {
    G pro(){
        return this;
    }

    public static void main(String[] args){
        G x = new G();
        G y = x.pro();
        if(x==y)
        System.out.println("Same");
    }
}
//this will print Same because 
// we can pass this as a return type that the method will return the object of same class
