public class A5 {
    public static void main(String[] args) {
        // short s = 12452;//correct
        // // s = 32768;//compilation error because value is out of range of the short

        // s = 32767;//correct because in range
        // System.out.println(s);

        // int x = 2321434233;//compilation error because out of range of int

        // int x = 23232323;//correct valid

        // System.out.println(x);

        // long x = 8989898989;//compilation error
        //as integer is too large

        // long x = (long) 8989898989;//also gives compilation error 
        // int x = (int) 8989898989;//compilation error

        long x = 8989898989l;//no error because now it is treated as a long variable
        System.out.println(x);
        // x = 2523454234523452345234653452345234l;//compilation error


    }
}
