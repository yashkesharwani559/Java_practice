public class M {
    public static void main(String[] args) {
        ZA a;//legal code

        ZA[] b;//legal code

        ZA[] c = new ZA[3];//this is valid because here we are creating an array of the interface variables and we have created it so that we can store object of its child concreete classes using polymorphism
        System.out.println(c);
        System.out.println(c.length);

    }
}

interface ZA{}

//this will print output as
// [LZA;@64cd705f
// 3