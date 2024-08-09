import java.util.Scanner;

class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(n);
    }
}

//facts about Scanner class

//Object class is the direct parent of the Scanner class 

// 1. Scanner class is present in java.util package. So we have to import it before use Scanner is a final class in java
// 2. Scanner(InputStream) --> is a constructor present in the Scanner class that takes input as Object of InputStream class which we can give by writing System.in
// 
// now object of Scanner class is created and it can be used to take inputs from user because it contains methods that are to take specific input from the user
// some of them are:-
// nextInt()   -->  takes integer as input 
// next()   -->  takes String as input 
// nextBoolean()   -->  takes boolean as input 
// nextByte()   -->  takes byte as input 
// nextShort()   -->  takes short as input 
// nextLong()   -->  takes long as input 
// nextFloat()   -->  takes float as input 
// nextdouble()   -->  takes double as input 
// 