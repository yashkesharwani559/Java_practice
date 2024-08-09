public class S {
    public static void main(String[] args){
        String s = "Mohan is a boy.";

        String str = s.substring(6);
        String str2 = s.substring(6,15);

        System.out.println(str.equals(s));//false
        System.out.println(str2.equals(s));//false
    }
}
