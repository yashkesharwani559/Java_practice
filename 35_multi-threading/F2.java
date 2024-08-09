class F2 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        t.setId("12");//compilation fail
        //because there is no method to set/change the Id of a thread and then main default thread is assigned the Id 1
    }
}