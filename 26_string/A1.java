public class A1 {
    public static void main(String[] args){
        String s = "mohan";
        String s1 = new String("mohan");//valid syntax
        String s2 = new String("mohan");

        System.out.println(s == s1);
        System.out.println(s2 == s1);
        System.out.println(s == s2);
    }
}

//output
// false
// false
// false
//this is returning false because when we create variables using new keyword then each time a new object is created