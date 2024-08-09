public class H {
    public static void main(String[] args){
        String s = "Hello i am yash and how are you i am fine";

        int[] x = new int[10];
        int from = -1;
        do{
            from = s.indexOf('i',from + 1);
            if(from != -1){
                System.out.println("i is found at index : "+from);
            }
        }while(from != -1);
        System.out.println("searching completed");

    }
}
//in the String the indexing starts from 0 which is same as the array
