public class Z6 {
    public static void main(String[] args){
        throw new Exception();
    }
}
//this compilation error shows that Exception is a class of type checked exception

// Z6.java:3: error: unreported exception Exception; must be caught or declared to be thrown
//         throw new Exception();
//         ^
// 1 error
// error: compilation failed