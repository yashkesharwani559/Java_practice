public class T1 {
    public static void main(String[] args){
        String s = "RAM";

        String st = s.toUpperCase();

        System.out.println(s == st);//true
        //because here both string stores the reference code of the same object that is created in the string constant pool this is because we have done no change in the string

        System.out.println(s.equals(st));//true
        String st2 = s;

        s = s.toLowerCase();

        System.out.println(s == st2);//false

        System.out.println(s);//ram
        System.out.println(st2);//RAM


    }
}
