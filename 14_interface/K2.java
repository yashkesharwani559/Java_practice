interface F3{
    int x = 45;
}
class K2 {
    public static void main(String[] args){
        System.out.println("F3.x");
        F3.x = 56;
    }
}
//this will give error because the variable decalared inside the interface is implicitly final and that's why we can access it but we cannot remodify it
// K2.java:7: error: cannot assign a value to final variable x
//         F3.x = 56;
//           ^
// 1 error