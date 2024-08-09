class A extends BA{
    public static void main(String[] args) {
    }

    void pro() {
        System.out.println("A");
    }//correct

}

class BA{
    synchronized void pro() {
        System.out.println("B");
    }
}