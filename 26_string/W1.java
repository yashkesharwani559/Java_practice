public class W1 {

    public static void main(String[] args){
        String s = "He is a no.1 boy and is a no.11 person";

        System.out.println(s);
        
        s = s.replaceAll("\d", "a");//this will give compilation error
    }
}

// W1.java:8: error: illegal escape character
//         s = s.replaceAll("\d", "a");//this will give compilation error
//                            ^
// 1 error