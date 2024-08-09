public class I {
    {
        System.out.println(1);
        try{
            System.out.println(2);
        }catch(ArithmeticException e){
            System.out.println("solution");
        }
        System.out.println(4);
    }
}
//try-catch are allowed in the instance initialization block