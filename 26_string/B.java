public class B {
    public static void main(String[] args) {
        String s = "mohan";
        // System.out.println(s = "Mohan");//Mohan

        System.out.println(s == "mohan");//true
        String s1 = "MOHAN";
        System.out.println(s1 == s);//false because java is case sensitive 
    }
}
