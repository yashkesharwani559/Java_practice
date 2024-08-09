public class K1 {
    public static void main(String[] args){
        
    }

    public static void pro(){
        synchronized (this) {//compilation fail
            //because we cannot use this inside the static method

        }
    }
}

// K1.java:7: error: non-static variable this cannot be referenced from a static context
//         synchronized (this) {//compilation fail
//                       ^
// 1 error
// error: compilation failed
