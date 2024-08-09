class K {
    void pro() {
        RR r = new RR() {
            private int e = 5;

            void info() {
                System.out.println("Hi" + e);
            }
        };

        // System.out.println(r.e);//not allowed because e is private in the RR class
        r.info();
    }

    public static void main(String[] args) {
        new K().pro();
    }
}


//output
// Hi5

class RR {
    private int e = 9;

    void info() {
        System.out.println("Hello" + e);
    }
}
