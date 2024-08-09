public class E {
    public static void main(String[] args){
        String s = new String("mohan");
        String s1 = new String("mohan");

        System.out.println(s == "mohan");//false
        System.out.println(s == s1);//false
        //here it is giving false because it is only checking the reference code of the object that is stored in the vairable

        System.out.println(s.equals(s1));//true
        //boolean equals(Object) is an instance method in the String class that is the overridden version of the equals() method in the Object class
        //since Object class is the direct parent of the String class
        
    }
}
