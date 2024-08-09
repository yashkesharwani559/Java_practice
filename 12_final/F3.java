class F2{
    final void aa(){
        System.out.println("Hello in aa F");
    }
}

class A extends F2{
    void aa(int a){
        System.out.println("Hello in aa A");
    }
    public static void main(String[] args){
        A a = new A();
        a.aa(20);
    }
}
//this will give no error because the no. of parameters of aa() is different in parent and child class
// and that's why it is treated as a separate method