// so first of all make all the costructors private 

// step 2: make a static variable carrying the object of that class so that one can access the object using that variable only

public class D {
    public static void main(String[] args) {
        
        XD x = XD.x;
        x.show();//pro

    }
}

class XD {
    //early initialization because here the object of XD class is always created and also even if it is not needed
    static XD x = new XD();

    
    private XD(){

    }
    private XD(int x){

    }
    void show(){
        System.out.println("pro");
    }
}