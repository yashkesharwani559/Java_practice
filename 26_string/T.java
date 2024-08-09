public class T {
    public static void main(String[] args){
        String str = "RAM";

        String str2 = "ram";

        String s = str2.toUpperCase();

        System.out.println(s == str);//false
        //this will print false because s and str both have different reference code which means that the String s object stores the object of the non-String constant pool whereas String str stores the refeerence code of the object that is created in the string constant pool
        //this shows that string objects are immutable so each time when we want to manipulate the string a new object is created 



        System.out.println(s.equals(str));//true
        //this prints true because it checks the value not reference code

        System.out.println(str2);//ram
    }
}
