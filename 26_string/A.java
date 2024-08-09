class A{
    public static void main(String[] args){
        String s = "mohan";
        String s2 = "mohan";
        System.out.println(s==s2);
        System.out.println(s2);
        System.out.println(s);

    }
}
//output
// true
// mohan
// mohan
 
// both are same because when we create string like this 
// String s = "how"; then it creates only one object in the String constant pool and store its reference code in the s variable and after it if we try to create new string variable having same content then java will assign same objet to that variable also
