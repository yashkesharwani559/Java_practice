class B {
    static Account1 a = new Account1();

    public static void main(String[] args) {

        BThread a1 = new BThread();
        BThread a2 = new BThread();
        a1.setName("AA");
        a2.setName("BB");

        a1.start();
        a2.start();

    }
}

class Account1 {

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

        }
    }

}

class BThread extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++) {
            B.a.withdraw(10);
            System.out.println("Remaining amount: " + B.a.getAmt());
        }
    }
}

//output
// Remaining amount: 30
// Remaining amount: 30
// Remaining amount: 20
// Remaining amount: 10
// Remaining amount: 0
// Remaining amount: 0
// Remaining amount: 0
// Remaining amount: 0
// Remaining amount: 0
// Remaining amount: 0


//here it is repeating the 30 because between the subtracting amount on one thread but before printing the other thread will run and subtract the amount and then it is printing the deducted amount.
