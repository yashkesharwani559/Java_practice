
public class F {
    public static void main(String[] args) {

        XF x = XF.getInstance();
        XF x1 = XF.getInstance();
        XF x2 = XF.getInstance();

        System.out.println(x);
        System.out.println(x1);
        System.out.println(x2);
        //here all above three will print same because now we have made the XF class a singleton class.
        
        x.show();//pro

    }
}

//so now XF is became a singleton class but here early initialization is used.

class XF {
    //early initialization because here the object of XF class is always created and also even if it is not needed
    private static XF x = new XF();

    
    private XF(){

    }
    private XF(int x){

    }

    void show() {
        System.out.println("pro");
    }

    //getter method to get the object of the XF class 
    public static XF getInstance(){
        return x;
    }

}