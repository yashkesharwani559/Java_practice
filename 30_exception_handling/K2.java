import java.io.FileNotFoundException;
import java.io.FileReader;

class K2 {
    public static void main(String[] args) {
        System.out.println("A");
        abc();
        System.out.println("B");
    }   
    
    static void abc() {
        System.out.println("C");
        try{
            mno();
        }catch(FileNotFoundException e){
            System.out.println("solution");
        }
        System.out.println("D");
    }
    
    static void mno() throws FileNotFoundException{
        System.out.println("E");
        pqr();
        System.out.println("F");
    }
    
    static void pqr() throws FileNotFoundException {
        System.out.println("G");
        FileReader fr = new FileReader("yam.txt");
        
        System.out.println("H");
    }
}

//output
// A
// C
// E
// G
// solution
// D
// B