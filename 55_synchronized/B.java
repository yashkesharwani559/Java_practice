class B extends B1 {
    public static void main(String[] args) {
    }

    synchronized void pro() {
        System.out.println("A");
    }//correct

}

class B1{
    void pro() {
        System.out.println("B");
    }
}