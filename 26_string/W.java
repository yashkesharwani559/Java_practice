public class W {
    public static void main(String[] args){
        String s = "He is a no.1 boy and is a no.11 person";

        System.out.println(s); 
        
        // s = s.replaceAll("\\d","5");
        // System.out.println(s);//He is a no.5 boy and is a no.55 person
        
        s = s.replaceAll("\\d\\d","5");
        System.out.println(s);//He is a no.1 boy and is a no.5 person

    }
}
