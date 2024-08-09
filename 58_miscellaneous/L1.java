public class L1 {
    public static void main(String[] args) {
        try{
            System.out.println(Class.forName("String"));
        }catch(ClassNotFoundException e){
            System.out.println("Exception found");
        }
    }
}

//output
// Exception found