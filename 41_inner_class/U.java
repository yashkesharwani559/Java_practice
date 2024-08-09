public class U {

    static GG2 g = new GG2() {
        // static GG2 g = new GG2(24) {//compilation fail because there is no constructor that is int parameterized in the interface 
        
    };

    public static void main(String[] args) {
        System.out.println(g);
    }
}

interface GG2 {
    
}

// U.java:3: error: anonymous class implements interface; cannot have arguments
//     static GG2 g = new GG2(24) {
//                            ^
// 1 error
// error: compilation failed