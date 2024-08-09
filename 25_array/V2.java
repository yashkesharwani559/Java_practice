public class V2 {
   public static void main(String[] args){
    System.out.println(args.length);//0
    // this is because an object of the String class is always created and stored in the args 
    // so implicitly args is never initialized with null but it is initialized with a string[] object
   }
}
