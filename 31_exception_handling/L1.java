public class L1 {
    public static void main(String[] args){
        try{
            System.out.println(2);
        }catch(Throwable e){
            System.out.println(e);
        }
    }
}
//correct code because writing catch block for checked exception even when its try block doesnot generates it, is possible in case of Throwable and Exception class