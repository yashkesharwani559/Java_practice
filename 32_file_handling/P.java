import java.io.File;

public class P {
     
    public static void main(String[] args) {
    
        File f = new File("pqr");

        System.out.println("1");

        for (String s : f.list()) {
            System.out.println(">>>>>>  " + s);
        }
                
    }
}

//output
// 1
// 2
