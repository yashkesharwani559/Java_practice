import java.util.ArrayList;
 
public class Q {
    public static void main(String[] args){

        // ArrayList<?> arr = new ArrayList<CC>();//correct

        ArrayList<?> arr = new ArrayList<Object>();
        
        ArrayList<?> arr1 = new ArrayList<AA>();
        ArrayList<?> arr2 = new ArrayList<BB>();
        
        ArrayList<?> arr3 = new ArrayList<CC>();
        
        ArrayList<?> arr4 = new ArrayList<DD>();
        //short form of 
        // ArrayList<? extends Object> arr4 = new ArrayList<DD>();
        //because here we can't add objects

        ArrayList<?> arr5 = new ArrayList<Days>();
 
        ArrayList<?> arr6 = new ArrayList<>();//correct

    }
}
class AA{}
abstract class BB{}
interface CC{}
enum Days{Monday, tuesday, wednesday, thrusday};
class DD{
    class EE{}
}