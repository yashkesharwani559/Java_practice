//Example of ClassNotFoundException
public class S {
    public static void main(String[] args){  
        System.out.println(1);
        try{
            System.out.println(2);
            Class.forName("java.lang.String");
            System.out.println(3);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        System.out.println(4);
        
    }
}

//output
// 1
// 2
// 3
// 4

//there is a class Class in java.lang package which contains a static method forName(String) which takes the full path of class as String, and the forName() method gives ClassNotFoundException when it doesnot founds the given class in given package