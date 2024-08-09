public class J {
    public static void main(String[] args){
        String s = "yash is a boy. He is a boy. He is a master in the basics of core java";
        System.out.println(s.lastIndexOf("boy"));//23
        
        String s1 = "boy  is a  boy";
        //                     ^11
        System.out.println(s1.lastIndexOf("boy"));//11

        String s2 = "boy  is a  boy";
        //          ^0
    //                         ^11    
        System.out.println(s2.lastIndexOf("boy",10));//0
        System.out.println(s2.lastIndexOf("boy",12));//11
        


    }
}
//int lastIndexOf(String) --> is an instance method in the class string that takes the string as input and returns the starting index of the input string and if present from the last and returns -1 if string is not present
//means if two are same that is searched then lastIndexOf() returns the starting index of the nearest to the ending side
//lastIndexOf() search from right to left

// like here as 
// yash is a  b o y .  H e   i s   a   b o y .
// 1234567891011121314151617181920212223
