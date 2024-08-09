interface U1{
    void pro(){
        System.out.println("Hello");
    }
}
//this will give error because a method inside an interface cannot be defined
// U1.java:2: error: interface abstract methods cannot have body
//     void pro(){
//               ^
// 1 error