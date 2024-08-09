class O3 {
    static UThread u = null;
    static VThread v = null;

    public static void main(String[] args) {
        u = new UThread();
        v = new VThread();

        u.setName("AviChhacha");
        v.setName("Dhoomketu");

        u.start();
        v.start();
    }
}

//here this will create a situation of deadlock because both the pro() in UThread class and mno() in VThread class both are static synchronized so only one can access the method at a time and both want to run both which will create an infinite block in the blocked state creating a deadlock

class UThread extends Thread {
    public void run() {
        O3.u.pro();
        // pro();same as above
    }

    synchronized static void pro() {
        try {Thread.sleep(10);} catch(InterruptedException e) { e.printStackTrace(); }
        O3.v.mno();
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }
}

class VThread extends Thread {
    public void run() {
        O3.v.mno();
    }

    synchronized static void mno() {
        try {Thread.sleep(10);} catch(InterruptedException e) { e.printStackTrace(); } 
        O3.u.pro();
        Thread x = Thread.currentThread();
        for(int i=0;i<20;i++)
            System.out.println(i + " - " + x.getName());
    }
}
