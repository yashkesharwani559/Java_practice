public class E {
    public static void main(String[] args){
        try{
            System.out.println(1);
        }catch(ArithmeticException e){
            System.out.println(2);
        } catch (NullPointerException e) {
            System.out.println(3);
        } finally {
            System.out.println(4);
        }
        catch(RuntimeException e){
            System.out.println(5);
        }
        
    }
}

//compilation error because catch is not allowed after the finally block