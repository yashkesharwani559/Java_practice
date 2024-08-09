class I{
    final int a = 34;
}

class A extends I{
    public static void main(String[] args){
        A x = new A();
        System.out.println(x.a);
    }
}
//so we can inherit the final variables of parent class to the child class 