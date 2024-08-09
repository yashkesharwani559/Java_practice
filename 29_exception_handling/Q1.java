public class Q1 {
    public static void main(String[] args) {
        
        try{
            // throw new Throwable();//correct
            // throw new Error();//correct
            // throw new Exception();//correct
            // throw new Object();//not correct because parent class object cannot be assigned to the child class variable
            
            // Object b = new Exception();
            // throw b;//not corrct

            throw new Q1();//not correct

        }catch(Throwable e){
            System.out.println(e);
        }

    }
}

//No exception of type Object can be thrown; an exception type must be a subclass of Throwable