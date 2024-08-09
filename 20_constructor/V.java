class A {
    A(int x) {
        System.out.println(x);
    }
}

class B extends A {
    int m = 15;
    B(){
        super(m);
    }
}
public class V {
    
}

// this will give compilation error at the line 10 because firstly the super() call is done and after this the child class instance variables are initialized and we cannot use the variable that is not even created

// V.java:10: error: cannot reference m before supertype constructor has been called
//         super(m);
//               ^
// 1 error