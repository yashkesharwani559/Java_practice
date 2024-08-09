import java.util.ArrayList;
 
public class P2 {
    public static void main(String[] args){

        // ArrayList<? extends CC> arr = new ArrayList<>();//correct

        ArrayList<? extends Object> arr = new ArrayList<Object>();
        //in instantiation site, we can write anything because since we are creating the ArrayList of Object and Object is the ultimate parent of all;
        
        ArrayList<? extends Object> arr1 = new ArrayList<AA>();
        ArrayList<? extends Object> arr2 = new ArrayList<BB>();
        
        ArrayList<? extends Object> arr3 = new ArrayList<CC>();
        //this is allowed even when interface is can't be the child of any class because we use ArrayList to store the objects and interface doesn't have constructor so he can't create objects but we can store the objects of the subclasses of the interface and all classes have parent-child relation with the object class

        ArrayList<? extends Object> arr4 = new ArrayList<DD>();

        ArrayList<? extends Object> arr5 = new ArrayList<Days>();


    }
}
class AA{}
abstract class BB{}
interface CC{}
enum Days{Monday, tuesday, wednesday, thrusday};
class DD{
    class EE{}
}