class D {
    static Account3 a = new Account3();

    public static void main(String[] args) {

        DThread a1 = new DThread();
        DThread a2 = new DThread();
        a1.setName("AA");
        a2.setName("BB");

        a1.start();
        a2.start();

    }
}

class Account3 {

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

class DThread extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++) {
            if (D.a.getAmt() >= 10) {

                D.a.withdraw(10);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }

                System.out.println("Remaining amount: " + D.a.getAmt());

            }
        }
    }
}

//applying private to amt and synchronized to getAmt() and withdraw(int) method will stopping the code to print negative amount but here it is repeating 30. It is because when one runs the 

//output
// Remaining amount: 30
// Remaining amount: 30
// Remaining amount: 10
// Remaining amount: 10
// Remaining amount: 0