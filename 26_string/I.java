public class I {
    public static void main(String[] args) {

        String s = " I am a boy";

        System.out.println(s.indexOf("boy"));//8
        System.out.println(s.indexOf("yash"));//-1
    }
}

//int indexOf(String) is an overridden method of the indexOf(char) method that takes the String as input and returns the starting index if the input string is present. also it returns -1 if the string is not present
