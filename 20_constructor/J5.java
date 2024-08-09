public class J5 {
    static int x = 5;

    J5() {
        
    }
    
    J5(int x) {
        this();
        this();
    }
}

//this will give compilation error because we can call only one time and at the first line to a constructor using this() call

// J5.java:10: error: call to this must be first statement in constructor
//         this();
//             ^
// 1 error