public class L {
    public static void main(String[] args){
        LA a = () -> System.out.println("hello");//compilation fail because LA is not a functional interface
    }
}

abstract class LA {
    abstract void pro();
}

// L.java:3: error: incompatible types: LA is not a functional interface
//         LA a = () -> System.out.println("hello");//compilation fail because LA is not a functional interface
//                ^
// 1 error
// error: compilation failed