interface F3{

}
class G{
    public static void main(String[] args){
        F3 f = new F3();
    }
}
//this will give error because interface doesnot have constructors and we cannot create constructors in it
// G.java:6: error: F3 is abstract; cannot be instantiated
//         F3 f = new F3();
//                ^
// 1 error