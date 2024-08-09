public class N1 {
    static int a = 45;
    static void pro(){
        System.out.println("pro");
    }
    static class X{
        X(){
            System.out.println("X");
        }
    }
    public static void main(String[] args){
        System.out.println(a);
        pro();
        new X();
        //all above 3 are correct 
        // this means that we can directly call the constructor of a static inner class(nested) from the static method of the same class
    }
}
