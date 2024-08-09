public class K {
    static int i = 0;
    public static void main(String[] args){
        
        Class c = K.class;

        System.out.println(c);//class M
        //correct

        System.out.println(c.i);//compilation error
        //because static members of a class can be accessible only <class-name>.<static-member>

    }
}
// M.java:10: error: cannot find symbol
//         System.out.println(c.i);//compilation error
//                             ^
//   symbol:   variable i
//   location: variable c of type Class
// 1 error
// error: compilation failed
