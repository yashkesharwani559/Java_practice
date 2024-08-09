public class L1 {
    public static void main(String[] args){
        boolean[] a = new boolean[3];

        System.out.println(a.length);//3

        // a.length = 4;//this will give compilation error 

    }
}

//this will give compilation error because length variable(property) is a final static variable so we cannot change/modify the value of the variable
// L1.java:7: error: cannot assign a value to final variable length
//         a.length = 4;//this will give compilation error
//          ^
// 1 error
