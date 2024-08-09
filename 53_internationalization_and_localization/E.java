import java.util.Date;

public class E {
    public static void main(String[] args) {
        
        Date d = new Date();

        System.out.println(d);
        
        d.setTime(d.getTime()+ 3600000);//this will increase the timing by one hour

        System.out.println(d);
        
    }
}
// Mon Feb 19 23:57:35 IST 2024
// Tue Feb 20 00:57:35 IST 2024