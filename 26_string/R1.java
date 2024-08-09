public class R1 {
    public static void main(String[] args){
        String s = "Yash is a boss";


        System.out.println(s.replace("Yash","Rahul"));//Rahul is a boss
        
        System.out.println(s == s.replace("Yash","Yash"));//true
    }
}

//String replace(CharSequence i, CharSequence j)  ---> is an instance method in String that replaces all i with j and return the new String
//CharSequence is an interface in java in the java.lang package and in java.base Module
// CharSequence is implemented by String, StringBuilder, StringBuffer, Segment, CharBuffer

//and due to runtime polymorphism we can pass the String to the CharSequence variable in java
// so basically replace(CharSequence, CharSequence ) method is used to replace a particular part of a string from the given string