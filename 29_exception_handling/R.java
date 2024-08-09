public class R {
    public static void main(String[] args) {
        
        try{
            throw new Exception();
        }
        // catch(Exception e){//correct

        // catch(Error  e){//not correct

            // catch(Object e){//not correct because No exception of type Object can be thrown; an exception type must be a subclass of Throwable

            catch (R a) {//not correct because No exception of type R can be thrown; an exception type must be a subclass of Throwable

        }
        
    }
}
