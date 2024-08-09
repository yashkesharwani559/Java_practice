public class O {
    public static void main(String[] args) {
        
        System.out.println(1);

        try{
            int[] x = {1, 23};
            System.out.println(2);
            System.out.println(x[3]);
            System.out.println(3);
            String s = "hi";
            System.out.println(s.charAt(3));
        }catch(IndexOutOfBoundsException e){
            System.out.println("IOBE");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("AIOBE");
        }

    }
}

//this will give compilation error because
//parent class variable argument catch is written before the child class variable argument catch then it will give compilation error because parent class catch variable can catch all exception so there is no need of the child class catch and so it will never run and that's why it is not needed 
//but its converse is true



//compilation error

// O.java:15: error: exception ArrayIndexOutOfBoundsException has already been caught
//         }catch(ArrayIndexOutOfBoundsException e){
//          ^
// 1 error
// error: compilation failed
