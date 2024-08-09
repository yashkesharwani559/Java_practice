interface IA{
    void pro();
    void info();
}


public class I {
    public static void main(String[] args) {
        IA a = () -> System.out.println("hello");//compilation fail because IA is not a functional interface        
    }
}

// I.java:9: error: incompatible types: IA is not a functional interface
//         IA a = () -> System.out.println("hello");//compilation fail because IA is not a functional interface
//                ^
//     multiple non-overriding abstract methods found in interface IA
// 1 error
// error: compilation failed
