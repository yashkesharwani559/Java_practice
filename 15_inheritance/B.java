class A {}
interface E{}
class C extends A implements E{}
interface F{}
class D extends C implements F{}
class B {
    public static void main(String[] args){
        D x = new D();

        //instanceof is a keyword that is used as a operator. The associativity of this operator is from left to right. The use of instanceof operator is to check is-a relationship between object to the class or interface
        //instanceof operator returns boolean means true or false
        System.out.println(x instanceof C);
        System.out.println(x instanceof D);
        System.out.println(x instanceof E);
        System.out.println(x instanceof F);
        System.out.println(x instanceof A);
        System.out.println(x instanceof Object);
        //this will give no error
        // all will print true
    }
}