public class P1 {
    public static void main(String[] args) {

        System.out.println(new MyCustomException1());

        System.out.println(new MyCustomException1("hii"));

    }
}
//output
// MyCustomException1
// MyCustomException1: hii

class MyCustomException1 extends RuntimeException {
    MyCustomException1(){

    }

    MyCustomException1(String message) {
        super(message);
    }
}

//this is possible because Throwable and its each subclasses contains two constructors :- 1. non-parameterized and 2. String argument parameterized constructor . 
//Throwable class contains a private String detailMessage vairable, that is setted the value by using Throwable String parameterized constructor