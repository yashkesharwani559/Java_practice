import java.util.Date;
import java.text.SimpleDateFormat;

public class P1 {
    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss z dd.MM.yyyy");

        System.out.println(sdf.format(date));

    }
}
//output
// 23:29:46 IST 26.02.2024