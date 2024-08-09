public class G1 {
    
    class X {
        X(){
            System.out.println("inner class X");
        }
    }

    void info() {
        new X();
        this.new X();//same as above
    }

    public static void main(String[] args) {
        new G1().info();

    }
}
//output
// inner class X
// inner class X
