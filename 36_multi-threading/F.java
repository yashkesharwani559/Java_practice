class F {
    static Account5 a = new Account5();

    public static void main(String[] args) {

        FThread a1 = new FThread();
        FThread a2 = new FThread();
        a1.setName("AA");
        a2.setName("BB");

        a1.start();
        a2.start();

    }
}

class Account5 {

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

        if (F.a.getAmt() >= 10) {
            
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }

            this.amt -= amt;
            
        }
    }
    
}

class FThread extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++) {
            F.a.withdraw(10);
            System.out.println("Remaining amount: " + F.a.getAmt());
        }
    }
}

//here this is repeating 30 because getAmt() of new thread will run after the withdraw() of old thread

//output
// Remaining amout: 30
// Remaining amout: 30
// Remaining amout: 20
// Remaining amout: 0
// Remaining amout: 0
// Remaining amout: 0
// Remaining amout: 0
// Remaining amout: 0
// Remaining amount: 0
// Remaining amount: 0
