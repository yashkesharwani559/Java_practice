class K {
    static AccountK k = new AccountK();

    public static void main(String[] args) {
        
        KThread k1 = new KThread();
        KThread k2 = new KThread();
        k1.setName("AA");
        k2.setName("BB");

        k1.start();
        k2.start();

        Thread t = Thread.currentThread();

        for(int i=0; i<20; i++)
        System.out.println(t.getName());

    }
}

class AccountK {

    String accType;
    String accNo;
    private int balance = 50;

    public String getAccType() {
        return accType;
    }

    public String getAccNo() {
        return accNo;
    }

    public int checkBalance() {
        synchronized (this) {
            return balance;
        }
    }

    public void withdraw(int balance) {
        synchronized (this) {
            if (this.balance >= balance) {
                this.balance -= balance;
            } else {
                System.out.println("balance is: " + this.balance);
            }
        }
    }

}


class KThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 0; i < 5; i++)
        {
            K.k.withdraw(10);
            System.out.println(t.getName() + " and balance is "+ K.k.checkBalance() );
        }
    }
}

//output
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// BB and balance is 30
// BB and balance is 20
// AA and balance is 40
// BB and balance is 10
// AA and balance is 0
// balance is: 0
// BB and balance is 0
// balance is: 0
// balance is: 0
// BB and balance is 0
// AA and balance is 0
// balance is: 0
// AA and balance is 0
// balance is: 0
// AA and balance is 0