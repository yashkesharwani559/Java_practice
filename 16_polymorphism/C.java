class Z{

}
class Y extends Z{

}

class X extends Y{}

class C{
    public static void main(String[] args){
        Y x = new Z();
        X y = new Z();


    }
}
//this will give error because we cannot store parent class object reference code in the child class variable in java

//this will give error as
// C.java:12: error: incompatible types: Z cannot be converted to Y
//         Y x = new Z();
//               ^
// C.java:13: error: incompatible types: Z cannot be converted to X
//         X y = new Z();
//               ^
// 2 errors