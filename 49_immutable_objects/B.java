public class B {
    public static void main(String[] args) {
        
        Integer i = 26;

        Integer i1 = i;

        i = 78;

        System.out.println(i);//78
        System.out.println(i1);//26

    }
}
// means the wrapper classes and String objects are immutable but we can store new objects in the same variable because variables are not final, only the object can't be modified
