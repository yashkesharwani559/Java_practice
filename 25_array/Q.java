public class Q {
    public static void main(String[] args){
        int[][][] x = new int[2][3][3];

        
        // System.out.println(x instanceof Object);//true
        // System.out.println(x[0] instanceof Object);//true
        // System.out.println(x[0][0] instanceof Object);//true
        
        // System.out.println(x[0][0][0] instanceof Object);//compilation error becuase here x[0][0][0] is an int variable and a primitive datatype is not an object so it cannot pass is-a relation with a class
        

        String[][][] y = new String[2][3][3];
        
        System.out.println(y instanceof Object);//true
        System.out.println(y[0] instanceof Object);//true
        System.out.println(y[0][0] instanceof Object);//true
        System.out.println(y[0][0][0] instanceof Object);//false
        //last one is true because here the y[0][0][0] is an reference variable of string class but this time null is stored in it and that's why it will print output as false

        
    }
}
