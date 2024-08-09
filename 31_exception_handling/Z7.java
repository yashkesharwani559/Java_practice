public class Z7 {
    public static void main(String[] args){
        throw new Throwable();
    }
}
//this compilation error shows that Throwable is a class of type checked exception

// Z7.java:3: error: unreported exception Throwable; must be caught or declared to be thrown
//         throw new Throwable();
//         ^
// 1 error
// error: compilation failed