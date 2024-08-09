class F2{
    final void aa(){
        System.out.println("Hello in aa F");
    }
}

class A extends F2{
    void aa(){
        System.out.println("Hello in aa A");
    }
    public static void main(String[] args){
        A a = new A();
        a.aa();
    }
}

//this below error is because the the final method cannot be overriden

// F2.java:8: error: aa() in A cannot override aa() in F2
//     void aa(){
//          ^
//   overridden method is final
// 1 error