//example to convert string into the Integer class object
 
public class X1 {
    public static void main(String[] args)  {
        
        String s = "234";
        System.out.println(s + 2);//2342

        //method 1
        // Integer a = new Integer(s);//can be used but deprecated
        // System.out.println(a + 2);//236
        
        //method 2
        System.out.println(Integer.valueOf(s)+2);//236
        
    }
}
