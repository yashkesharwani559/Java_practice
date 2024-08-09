public class Y1 {
    static int i;

    public static void main(String[] args) {
        try{
            pro();
        } catch (StackOverflowError e) {
            System.out.println("Hello");
        }finally{
            System.out.println("hii");
        }
        System.out.println("hi2");
    }
    
    static void pro(){
        System.out.println(i++);
        pro();
    }
}
//so this means try catch finally can be used for handling the Errors also

//output

// .
// .
// .
// .
// .
// .
// .
// 9469
// 9470
// 9471
// 9472
// 9473
// 9474
// 9475
// 9476
// 9477
// 9478
// 9479
// 9480
// 9481Hello
// hii
// hi2