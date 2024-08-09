class L {
    public static void main(String[] args) {
        

        
    }
}

class MyRunnable implements Runnable {
    void run() {
        
    }
}
//compilation error 
// L.java:10: error: run() in MyRunnable cannot implement run() in Runnable
//     void run() {
//          ^
//   attempting to assign weaker access privileges; was public
// 1 error
// error: compilation failed