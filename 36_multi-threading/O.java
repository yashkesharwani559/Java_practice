class O {
    public static void main(String[] args) {
        OThread t1 = new OThread();
        HThread t2 = new HThread();
        
        t1.setName("Indumati");
        t2.setName("Chhutki");
        
        t1.start();
        t2.start();
    }    
}
//this will create the situation of deadlock because both thread requires two locks of both class Doraemon and Nobita but both thread takes one and go to the block state for infinitely
class OThread extends Thread {
    public void run() {
        synchronized(Doraemon.class) {
            try {Thread.sleep(10);} catch(InterruptedException e) {e.printStackTrace();}
            synchronized(Nobita.class) {
                Thread x = Thread.currentThread();
                for(int i=0;i<20;i++)
                    System.out.println(i + " - " + x.getName());
            }}}}

class HThread extends Thread {
    public void run() {
        synchronized(Nobita.class) {
            try {Thread.sleep(10);} catch(InterruptedException e) {e.printStackTrace();}
            synchronized(Doraemon.class) {
                Thread x = Thread.currentThread();
                for(int i=0;i<20;i++)
                    System.out.println(i + " - " + x.getName());
            }}}}

class Doraemon { } 
class Nobita { } 