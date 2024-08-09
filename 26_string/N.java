public class N {
    public static void main(String[] args){
        String s = "Yash is a boy";
        //             ^starting index(3)
        // System.out.println(s.substring(3));//h is a boy
        // System.out.println(s.substring(0));//Yash is a boy
        // System.out.println(s.substring(-1));//this gives runtime exception as
        // System.out.println(s.substring(50));//this gives runtime exception as
        
        System.out.print(s.substring(s.length()));//
        //this will print nothing but also not give any error or exception

    }
}

//Srting subString(int starting_index)  --> is an instance method in the String class that returns a part of the String that starts from the given input index
//this method returns the string that is a part of the String from the given index till the end


// runtime exception as 
// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
//         at java.base/java.lang.String.substring(String.java:1837)
//         at N.main(N.java:7)