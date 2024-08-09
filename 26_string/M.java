public class M {
    public static void main(String[] args) {
        String s = "yash is a boy";
        System.out.println(s.endsWith("boy"));//true

        System.out.println(s.endsWith("a boy"));//true
        System.out.println(s.endsWith("aboy"));//false
        System.out.println(s.endsWith("y"));//true
        System.out.println(s.endsWith(""));//true

        s = "";
        System.out.println(s.endsWith(""));//true
        System.out.println(s.endsWith("a"));//false
    }
}

//boolean endsWith(String) --> is an instance method in the String class that is used to check that the String ends with the given input string (suffix string) or not