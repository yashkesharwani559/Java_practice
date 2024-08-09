
public class F1 {
    public static void main(String[] args) {

        XF1 x = XF1.getInstance();
        XF1 x1 = XF1.getInstance();
        XF1 x2 = XF1.getInstance();

        System.out.println(x);
        System.out.println(x1);
        System.out.println(x2);
        //here all above three will print same because now we have made the XF1 class a singleton class.
        
        x.show();//pro

    }
}

//so now XF1 is became a singleton class but here early initialization is used.

class XF1 {
    //early initialization because here the object of XF1 class is always created and also even if it is not needed
    private static XF1 x;

    //this is also an example of early initialization because here also the static block will always runs and without any need also it creates one object of this class
    static{
        x = new XF1();
    }
    
    private XF1(){

    }
    private XF1(int x){

    }

    void show() {
        System.out.println("pro");
    }

    //getter method to get the object of the XF1 class 
    public static XF1 getInstance(){
        return x;
    }

}