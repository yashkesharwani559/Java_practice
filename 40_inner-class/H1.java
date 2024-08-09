public class H1 {
    public static void main(String[] args) {
        
        // case 2:
        BB b = new BB();
        BB.X x = b.new X();

        // Case 1:
        // BB.X x = new BB().new X();
    }
}
//output
// hello ji

class BB{
    class X{
        X(){
            System.out.println("hello ji");
        }
    }
}