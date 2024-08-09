public class U5 {
    
}

@interface UU5{

}

// @interface UU6 extends UU5{}// not allowed means annotation can't extends another annotation

// @interface UU6 extends U5{} //not allowed

// interface UU7{}
// enum UU7{}
abstract class UU7{}

@interface UU6 extends UU7{}//not allowed

// means annotation can't inherited class, abstract class, interface, annotation and enum