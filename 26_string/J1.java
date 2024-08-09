public class J1 {
    public static void main(String[] args){
        String s = "yash is a good boy";

        System.out.println(s.lastIndexOf('o'));//16
        System.out.println(s.lastIndexOf('o',16));//16
        System.out.println(s.lastIndexOf('o',15));//12
        System.out.println(s.lastIndexOf('o',151));//16
        System.out.println(s.lastIndexOf('o',11));//11
    }
}
