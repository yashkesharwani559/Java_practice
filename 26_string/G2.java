public class G2 {
    public static void main(String[] args){
        String s = "I am a boy and a singer. I can do anything i want";

        System.out.println(s.indexOf('1',20));//-1
        System.out.println(s.indexOf('1'));//-1

    }
}
//both indexOf(char) and indexOf(char, int) gives -1 if character is not found