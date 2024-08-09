interface H1{
    void pro();
}
//by default, implicitly the method inside the interface is public abstract

class I implements H1{

}
//now this will give error because we have implemented the interface H1 but we have not defined the method pro() of H1 which is must
// I.java:6: error: I is not abstract and does not override abstract method pro() in H1
// class I implements H1{
// ^
// 1 error