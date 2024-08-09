abstract class H1{
    public static void main(String[] args){
        
    }

    synchronized abstract void pro();//compilation error 
}
//H1.java:6: error: illegal combination of modifiers: abstract and synchronized
//     synchronized abstract void pro();
//                                ^
// 1 error
// error: compilation failed