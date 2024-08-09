import java.io.Console;

public class U2 {
    public static void main(String[] args){
        Console con = System.console();
        int[] a = {
            Integer.parseInt(con.readLine()),
            Integer.parseInt(con.readLine()),
            Integer.parseInt(con.readLine()),
        };
        //this above is a valid legal code in java

        for(int ab : a)
        System.out.println(ab);
    }
}
