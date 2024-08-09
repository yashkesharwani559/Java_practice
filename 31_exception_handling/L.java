public class L {
    public static void main(String[] args){
        try{

        }catch(Exception e){
            System.out.println("solution");
        }
    }
}
//this should give the compilation error because Exception is a type of checked exception but here no compilation error comes because RuntimeException(that is an unchecked exception) is a child class/subclass of the Exception class
//so we can write catch block for Exception class even when its try doesnot throws the Exception object because Exception class has the child which are of type non-checked exception
