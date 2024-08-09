public class B2 extends String{
    public static void main(String[] args){
        String s = "mohan";
        String s1 = new String(s);//valid
        String s2 = new String(s1);//valid

        System.out.println(s);//mohan
        System.out.println(s1);//mohan
        System.out.println(s2);//mohan
    }
}
//this will give compilation error because String is a final class in java, so we can't create its child class