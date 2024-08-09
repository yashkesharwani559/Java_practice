//example for converting number string into int primitive data type

public class X {
    public static void main(String[] args){
        String s = "234";
        System.out.println(s + 2);//2342

        //method 1
        // int a = Integer.parseInt(s);//using static method of the Integer to convert a given string into the int primitive datatype
        // System.out.println(a + 2);//236
        
        
        //method 2
        Integer n = new Integer(s);//deprecated but can be used
        int a = n.intValue();
        System.out.println(a + 2);//236
        
    }
}
