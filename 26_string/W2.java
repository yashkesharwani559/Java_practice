public class W2 {
    public static void main(String[] args){
        String s = "He is a no.1 boy and is a no.11 person";

        System.out.println(s);//He is a no.1 boy and is a no.11 person
        
        s = s.replaceAll("is", "are");

        System.out.println(s);//He are a no.1 boy and are a no.11 person
    }
}