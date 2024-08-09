public class V {
    public static void main(String[] args) {
        try{
            
        }catch(Child1Exception e){
            System.out.println("child1");
        }
        catch(Child2Exception e){
            System.out.println("child2");
        }
        catch (ParentException e) {//for all other child exceptions and ParentException
            
            System.out.println("parent");
        }
    }
}
//correct code
class ParentException extends RuntimeException {
    
}

class Child1Exception extends ParentException {

}

class Child2Exception extends ParentException{

}

class Child3Exception extends ParentException{

}

class Child4Exception extends ParentException{

}

