public class G {
    public static void main(String[] args) {
        
        XG x1 = XG.getInstance();
        XG x2 = XG.getInstance();
        XG x3 = XG.getInstance();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        //here all will print null because getInstance() is always returns null
    }
}

class XG{
    private static XG y;
    private XG(){

    }
    private XG(int x){

    }
    public static XG getInstance(){
        return y;//this will always returns null because no object is assigned to y and y is a class-level class-type variable so it is by default initialized by null
    }
}