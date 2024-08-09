class H {
    public static void main(String[] args){
        X x = new AAA().new X();//compilation fail
        // because to access inner class we can't directly write the inner class name but we can write as   outer-class-name.inner-class-name
    }
}
class AAA{
    class X{
        X(){
            System.out.println("hello ji");
        }
    }
}