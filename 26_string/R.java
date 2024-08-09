public class R {
    public static void main(String[] args){
        String s = "hii how are you. I am fine";

        System.out.println(s.replace('i', 'o'));//hoo how are you. I am fone
        
        System.out.println(s == s.replace('i','0'));//false
        
        System.out.println(s == s.replace('i','i'));//true
    }
}
