class W {
    W(int y) {
        System.out.println("W() " + y);
    }
}

class K extends W {
    /*static*/ int golu = 9;
    
    K() {
        super(golu);

        System.out.println("K()");
    }   
    
    public static void main(String[] args) {
        K x = new K();
        System.out.println("main()");
    }
}

//this will give compilation error on line 11 because instance variable is initialized after the super() call so before the super() call there is no variable golu defined

// H.java:11: error: cannot reference golu before supertype constructor has been called
//         super(golu);
//               ^
// 1 error