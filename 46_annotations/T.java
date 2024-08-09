public class T {
    public static void main(String[] args) {
        Class klass = TT.class;

        Object obj = klass.getAnnotation(Mno.class);

        System.out.println(obj);//null

    }
}
//here the obj is null because by default the annotation is only till the compile time 
// and to make it runtime we use @Retention annotation 

@interface Mno{

}

@Mno
class TT{

}