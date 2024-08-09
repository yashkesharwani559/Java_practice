interface N5{
    int y = 35;
}
class N1{
    public static void main(String[] args){
        System.out.println(N5.y);

        N5.y = 45;

        System.out.println(N5.y);
    }
}
//we will get error on line 8 because variables of interface cannot be reinitiated or remodified in java
// N1.java:8: error: cannot assign a value to final variable y
//         N5.y = 45;
//           ^
// 1 error