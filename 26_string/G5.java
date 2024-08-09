public class G5 {
    public static void main(String[] args){
        String s = "";

        System.out.println(s.indexOf('a',5));//-1
        System.out.println(s.indexOf('a',-1));//-1
        System.out.println(s.indexOf('a',0));//-1
    }
}
//so this means that 
// 1. charAt(char) gives StringIndexOutOfBoundsException when it is called on an empty string and passing any character
// 2. but indexOf(char, int) and indexOf(char ) returns -1 if we run them on a empty string with any character and at any index