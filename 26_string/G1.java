public class G1 {
    public static void main(String[] args){
        String s = "I am a boy and a singer. I can do anything i want";

        System.out.println(s.indexOf('i',20));//39

    }
}

//int indeOf(char , int starting index)  ---> it is an overloaded version of the indexOf(char) method. It takes two inputs- first is the character to be searched and the second is the starting index that from where to start the searching

//also indexOf(char) and indexOf(char, int) returns -1 if character is not found 