public class O {
    public static void main(String[] args){
        String s = "Yash is a boy";
        System.out.println(s.toUpperCase());//YASH IS A BOY
        System.out.println(s);//Yash is a boy
        
        s = "Yash1234";
        System.out.println(s.toUpperCase());//YASH1234
        System.out.println(s);//Yash1234

        s = "Yash12[]#%";
        System.out.println(s.toUpperCase());//YASH12[]#%



    }
}
//String toUpperCase()  --> it is an instance method in String class that converts all the letters into the uppercase(if possible) and store it in a new string and then return that string