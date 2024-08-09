public class H {
    public static void main(String[] args){
        System.out.println(1);

        try{
            int x = Integer.parseInt(args[0]);
        }catch(NumberFormatException e){
            System.out.println("NFE");
        }
    }
}

//input - no input
// 1
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at H.main(H.java:6)

//here Exception in thread "main" is written which shows that the program is crashed and this exception is printed by the JRE(Java Rumtime Environment)