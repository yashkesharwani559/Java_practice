public class M1 {
    public static void main(String[] args){
        ZB[] a = new ZB[3];

        System.out.println(a[0]);
        a[1] = new AB();
        System.out.println(a[1]);
    }
}

interface ZB{}

class AB implements ZB{

}

//this will print output as
// null
// AB@635eaaf1