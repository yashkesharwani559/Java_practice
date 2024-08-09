public class O {
    public static void main(String[] args){
        OurThread ot = new OurThread();
        ot.start();
        ot.sleep();//compilation fail 
        // because there is no sleep() method in the AThread or Thread class which takes no argument.
    }
}

class OurThread extends Thread{
    public void run(){
        Thread t = Thread.currentThread();
        for(int i=0; i<20;i++)
        System.out.println(t.getName());
    }
}

//error
// O.java:5: error: no suitable method found for sleep(no arguments)
//         ot.sleep();//compilation fail
//           ^
//     method Thread.sleep(long) is not applicable
//       (actual and formal argument lists differ in length)
//     method Thread.sleep(long,int) is not applicable
//       (actual and formal argument lists differ in length)
// 1 error
// error: compilation failed