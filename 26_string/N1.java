public class N1 {
    public static void main(String[] args) {
        String s = "Yash is a boss and a honest person";
//                  01234
        System.out.println(s.substring(2, 20));//sh is a boss and a
        // System.out.println(s.substring(0, -1));//runtime exception as
        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 34
        // at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)
        // at java.base/java.lang.String.substring(String.java:1874)
        // at N1.main(N1.java:6)
        // System.out.println(s.substring(50,10));//same exception as above
        
        System.out.println(s.substring(11,10));//same exception as above

        System.out.println(s.substring(0, 0));//prints nothing but also not gives any error or exception

        System.out.println(s.substring(0,3));//Yas
    }

}

// String substring(int beginIndex, int endIdex)  ---> is an overridden version of the substring(int ) method . Only difference is that, it takes two integer arguments first is the starting index and the another one is the ending index
//here the creation of the substring includes the starting index but it excludes the ending index