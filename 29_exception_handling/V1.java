public class V1 {
    public static void main(String[] args) {
        try{
            
        }catch(Child1Exception e){
            System.out.println("child");
        }
        catch(Child2Exception e){
            System.out.println("child");
        }
        catch(Child3Exception e){
            System.out.println("child");
        }
        //same code for all the child exception expect ChildException 
        
    }
}