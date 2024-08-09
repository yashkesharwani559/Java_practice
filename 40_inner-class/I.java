public class I {
    class A {
        int t = 90;
    }

    public static void main(String[] args){
        A a = new I().new A();

        System.out.println(a.t);//90

    }
}
//means the instance members of the inner class are accessible directly to other members as they are its own members.
// but the object of the outer class cannot access the members of the inner class