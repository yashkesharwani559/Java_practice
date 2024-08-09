public class U {
    public static void main(String[] args) {
        
        char a = 'E';


        // to convert any uppercase alphabet to a lowercase alphabet add 32 in it
        //this is because
        // A = 65
        // and    a = 97
        // a - A = 97 - 65 = 32 
        // so difference between the lowercase and the uppercase is 32


        System.out.println(a);//E
        a += 32;

        System.out.println(a);//e

    }
}
