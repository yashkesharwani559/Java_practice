public class U1 {
    public static void main(String[] args) {
        char[] a = { 'I', ' ', 'a', 'm', ' ', 'a', ' ', 'b', 'o', 'y' };
        String s = new String(a);
        
        // String s = new String({ 'I', ' ', 'a', 'm', ' ', 'a', ' ', 'b', 'o', 'y' });//compilation error 
        // String s = new String( 'I', ' ', 'a', 'm', ' ', 'a', ' ', 'b', 'o', 'y' );//compilation error 

        System.out.println(s);//I am a boy
        
    }

}
