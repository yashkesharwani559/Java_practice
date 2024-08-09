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
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("AIOBE");
        }catch(IndexOutOfBoundsException e){
            System.out.println("IOBE");
        }

    }
}

//correct code 
// because first it checks the child class variable catch and then it runs the parent class variable catch


//output
// 1
// 2
// AIOBE