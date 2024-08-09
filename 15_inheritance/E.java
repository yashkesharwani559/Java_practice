class A{

}

class B extends A{

}
class C extends A{

}
class E extends C{
    public static void main(String[] args){
        E x = new E();

        System.out.println(x instanceof B);
    }
}
//this will give compilation error because we cannot pass any non parent class as operand in instanceof operator