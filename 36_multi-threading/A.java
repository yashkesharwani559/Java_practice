class A {
    static Account a = new Account();

    public static void main(String[] args) {

        AThread a1 = new AThread();
        AThread a2 = new AThread();
        a1.setName("AA");
        a2.setName("BB");

        a1.start();
        a2.start();

    }
}

class Account {

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
        this.amt -= amt;
    }

}

class AThread extends Thread {
    public void run() {
        int amt = 10;
        for (int i = 0; i < 5; i++) {
            if (A.a.amt >= amt) {
                A.a.withdraw(amt);
            }
            System.out.println("Remaining amount: "+A.a.getAmt());
        }
    }
}

//output
// Remaining amount: 30
// Remaining amount: 20
// Remaining amount: 10
// Remaining amount: 0
// Remaining amount: 0
// Remaining amount: 30
// Remaining amount: 0
// Remaining amount: 0
// Remaining amount: 0
// Remaining amount: 0

//output is not correct
