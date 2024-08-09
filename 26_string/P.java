public class P {
    public static void main(String[] args){
        String s = "Yash Is a BOSS";

        System.out.println(s.toLowerCase());//yash is a boss

        s = "Yash123";

        System.out.println(s.toLowerCase());//yash123

        s = "Yash1@[]&";
        System.out.println(s.toLowerCase());//yash1@[]&

        s = "yash";
        System.out.println(s == s.toLowerCase());//true

        String s1 = new String(s.toLowerCase());
        System.out.println(s == s1);//false

    }
}
//String toLowerCase() --> is an instance method that converts all the characters into the lowercase (if possible) and then return that new string
// but both toLowerCase() and toUpperCase() don't change the old string and it creates a new modified string 

