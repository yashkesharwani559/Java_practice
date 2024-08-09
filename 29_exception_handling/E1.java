public class E1 {
    public static void main(String[] args) {

        System.out.println(1);

        try {
            int x = Integer.parseInt("a");

        } catch (NumberFormatException e) {
            System.out.println("solved");
        }

        System.out.println(x);

    }
}
//this compilation error is because x decalred in the try has the scope inside try block only and that's why x is not accessible outside the try block


//this will give compilation error as
// E1.java:13: error: cannot find symbol
//         System.out.println(x);
//                            ^
//   symbol:   variable x
//   location: class E1
// 1 error
// error: compilation failed


