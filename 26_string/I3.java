public class I3 {
    public static void main(String[] args){
        String s = "yash is a boy. yash is compassionate to his work yash";

        int from = -1;
        do{

            from = s.indexOf("yash", from +1);
            if(from != -1){
                System.out.println("yash is found at index "+ from);
            }
        } while (from != -1);
        System.out.println("Searching completed");

    }
}
