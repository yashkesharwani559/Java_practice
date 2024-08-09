public class V2 {
    public static void main(String[] args) {
        try{
            
        }catch(Child1Exception | Child2Exception | Child3Exception e){
            System.out.println("child");
        }
        
    }
}