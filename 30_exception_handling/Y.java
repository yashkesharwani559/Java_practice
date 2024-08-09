class Y {
    public static void main(String[] args) {
        try {
            System.out.println(1);
            int i = 12 / 0;
        } catch (ArithmeticException e) {
            System.out.println(2);
            throw new IllegalArgumentException("wrong input");
            //chained exception
        }
        System.out.println(3);
    }
}

//output

// 1
// 2
// Exception in thread "main" java.lang.IllegalArgumentException: wrong input
//         at Y.main(Y.java:8)
