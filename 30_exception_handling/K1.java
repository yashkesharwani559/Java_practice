import java.io.FileNotFoundException;
import java.io.FileReader;

class K {
    public static void main(String[] args) {
        System.out.println("A");
        abc();
        System.out.println("B");
    }   
    
    static void abc() {
        System.out.println("C");
        mno();
        System.out.println("D");
    }
    
    static void mno(){
        System.out.println("E");
        try{
            pqr();
        }catch(FileNotFoundException e){
            System.out.println("solution");
        }
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
// F
// D
// B