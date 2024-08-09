public class K {
    public static void main(String[] args){
        String s = "Mohan is a good boy";

        System.out.println(s.startsWith("Mohan"));//true
        System.out.println(s.startsWith("Mohan is a g"));//true
        System.out.println(s.startsWith("Rohan"));//false
        System.out.println(s.startsWith("mohan"));//false
        System.out.println(s.startsWith("M"));//true
        System.out.println(s.startsWith(""));//true

        
    }
}
//boolean startsWith(String) --> is an instance method in the class String that is used to search that the string starts with the input string of not 
// if it starts then it returns true and otherwise it returns false
//and also java is case sensitive so it checks with case sensitivity

//so the startsWith() method returns true if we give input string as an empty string