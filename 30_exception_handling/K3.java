import java.io.FileNotFoundException;
import java.io.FileReader;

class K3 {
    public static void main(String[] args) {
        System.out.println("A");
        try{
            abc();
        }catch(FileNotFoundException e){
            System.out.println("solution");
        }
        System.out.println("B");
    }   
    
    static void abc() throws FileNotFoundException {
        System.out.println("C");
        mno();
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
// B