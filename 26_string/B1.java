public class B1 {
    public static void main(String[] args){
        String s = "mohan";
        String s1 = new String(s);//valid
        String s2 = new String(s1);//valid

        System.out.println(s);//mohan
        System.out.println(s1);//mohan
        System.out.println(s2);//mohan
    }
}
//this prints the mohan directly because in java when we call string reference variable it automatically calls the toString() overridden method of the String class
