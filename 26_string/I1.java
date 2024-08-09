public class I1 {
    public static void main(String[] args) {

        String s = " I am a boy. he is a boy";

        System.out.println(s.indexOf("boy", 9));//21
        System.out.println(s.indexOf("boy", 8));//8
        System.out.println(s.indexOf("yash", 10));//-1
    }
}
//int indexOf(String, int) the second parameter is the starting index here that is used to give the index that from where to start
// so it starts checking from the given index only