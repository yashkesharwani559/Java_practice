class D {
    int x;
    void pro(){
        System.out.println("hello");
    }
    class EE{

    }
    public static void main(String[] args){
        // System.out.println(x);//not allowed
        // pro();//not allowed
        new EE();//not allowed
        // because instance variables can't be directly accessed from a static method means instance members can't be accessed from a static context
    }
}

// D.java:12: error: non-static variable this cannot be referenced from a static context
//         new EE();//not allowed
//         ^
// 1 error