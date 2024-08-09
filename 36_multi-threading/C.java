class C {
    static Account2 a = new Account2();

    public static void main(String[] args) {

        CThread a1 = new CThread();
        CThread a2 = new CThread();
        a1.setName("AA");
        a2.setName("BB");

        a1.start();
        a2.start();

    }
}

class Account2 {

    String accNum;
    String accType;
    int amt = 50;

    public String getAccNum() {
        return accNum;
    }

    public String getAccType() {
        return accType;
    }

    public int getAmt() {
        return amt;
    }

    public void withdraw(int amt) {
        if (this.amt >= amt) {
             
            try{Thread.sleep(100);}catch(InterruptedException e){}
            
            this.amt -= amt;
            System.out.println("Remaining amount: " + C.a.getAmt());

        }
    }

}

class CThread extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++) {
            C.a.withdraw(10);
        }
    }
}


//output
// Remaining amount: 30
// Remaining amount: 30
// Remaining amount: 10
// Remaining amount: 20
// Remaining amount: 0
// Remaining amount: -10