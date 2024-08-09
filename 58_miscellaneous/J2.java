public class J2 {
    static int i = 9;
    public static void main(String[] args){
        J2 s = new J2();
        Class c = s.getClass();
        System.out.println(c.i);//compilation error
        // because we can access the static member of a class using  <class-name>.<static-member-name>
    }
}
// L.java:6: error: cannot find symbol
//         System.out.println(c.i);//compilation error
//                             ^
//   symbol:   variable i
//   location: variable c of type Class
// 1 error
// error: compilation failed