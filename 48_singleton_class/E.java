// so first of all make all the costructors private 

// step 2: make a static variable carrying the object of that class so that one can access the object using that variable only

//Step 3: make that static variable and create getters for that variable and getters are nothing but the static method that return the object of the XE class

public class E {
    public static void main(String[] args) {

        // XE x = XE.x;//compilation fail because x is now private in class XE

        XE x = XE.getInstance();

        x.show();//pro

    }
}

//so now XE is became a singleton class but here early initialization is used.

class XE {
    //early initialization because here the object of XE class is always created and also even if it is not needed
    private static XE x = new XE();

    
    private XE(){

    }
    private XE(int x){

    }

    void show() {
        System.out.println("pro");
    }

    //getter method to get the object of the XE class 
    public static XE getInstance(){
        return x;
    }

}