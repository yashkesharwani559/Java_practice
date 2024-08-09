
public class K4 {
    public static void main(String[] args) {
        System.out.println("main");
        
        try{
            
            aaa();
        }catch(ArithmeticException e){
            System.out.println("AE");
        }
        System.out.println("main1");
    }
    
    static void aaa() {
        System.out.println("A");
        bbb();
        System.out.println("A1");
    }

    static void bbb() {
        System.out.println("B");
        ccc();
        System.out.println("B1");
    }

    static void ccc() {
        System.out.println("C");
        int x = 12 / 0;
        System.out.println("C1");
    }
}

//output
// main
// A
// B
// C
// AE
// main1
