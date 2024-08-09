class G {
    static Account6 a = new Account6();

    public static void main(String[] args) {

        GThread a1 = new GThread();
        GThread a2 = new GThread();
        a1.setName("AA");
        a2.setName("BB");

        a1.start();
        a2.start();

    }
}

class Account6 {

    String accNum;
    String accType;
    private int amt = 50;

    public String getAccNum() {
        return accNum;
    }

    public String getAccType() {
        return accType;
    }

    synchronized public int getAmt() {
        return amt;
    }

    synchronized public void withdraw(int amt) {

        if (G.a.getAmt() >= 10) {
            
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }

            this.amt -= amt;
            
            System.out.println("Remaining amount: " + G.a.getAmt());
        }
    }
    
}

class GThread extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++) {
            G.a.withdraw(10);
        }
    }
}

//output
// Remaining amount: 40
// Remaining amount: 30
// Remaining amount: 20
// Remaining amount: 10
// Remaining amount: 0