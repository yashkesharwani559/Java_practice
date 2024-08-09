public class N1 {
    public static void main(String[] args) {

        ZB[] a = new ZB[3];

        System.out.println(a[0]);
        
        a[1] = new AB();
        
        System.out.println(a[1]);
    }
}

abstract class ZB{}

class AB extends ZB{

}

//this will print output as
// null
// AB@1700915