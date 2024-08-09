public class E {
    class FF{
        FF(){
            System.out.println("hello");
        }
        
    }
    public static void main(String[] args){
        FF f = new FF();//compilation error
        // because class FF is an instance inner class of the outer class E and instance member can't be access directly from a static method and to access the instance member we do <something>.member-name
    }
}
