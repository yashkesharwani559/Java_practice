class E {
    static Account4 a = new Account4();

    public static void main(String[] args) {

        EThread a1 = new EThread();
        EThread a2 = new EThread();
        a1.setName("AA");
        a2.setName("BB");

        a1.start();
        a2.start();

    }
}

class Account4 {

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
        this.amt -= amt;
    }
    
}

class EThread extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++) {
            if (E.a.getAmt() >= 10) {

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
                E.a.withdraw(10);

            }
            System.out.println("Remaining amount: " + E.a.getAmt());
        }
    }
}

//output
// Remaining amount: 30
// Remaining amount: 30
// Remaining amount: 10
// Remaining amount: 10
// Remaining amount: -10
// Remaining amount: -10
// Remaining amount: -10
// Remaining amount: -10
// Remaining amount: -10
// Remaining amount: -10