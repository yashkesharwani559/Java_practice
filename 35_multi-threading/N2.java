class N2 {
    public static void main(String[] args){
        AThread at = new AThread();
        at.start();
        System.out.println(at.isAlive());//true
        
        for(int i=0;i<50;i++)
        System.out.println("main");
        System.out.println(at.isAlive());//false
    }
}
class AThread extends Thread{
    public void run() {
        System.out.println("AThread");
    }
}