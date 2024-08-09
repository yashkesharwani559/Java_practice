public class D extends A4 {


}

class A4 {
    A4(D x) {
    }
}
//this will always gives error because we cannot pass the child class object as the argument in the parent class constructor because object is not ready till the parent class constructor is executed
