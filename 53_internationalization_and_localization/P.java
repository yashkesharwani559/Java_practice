import java.util.Date;
import java.text.SimpleDateFormat;

public class P {
    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat();

        System.out.println(sdf.format(date));
        
    }
}
//output
// 26/02/24, 11:27 PM