public class C {
    static void pro(int... a) {
        System.out.println(a);
        System.out.println(a.length);
    }

    public static void main(String[] args) {
        pro();//allowed
        //this will create an empty array with the length 0
    }
}
//output
// [I@7c729a55
// 0

// (...) -> this symbol is called ellipsis
// (...) ==>> var-args
// var-args means variable arguments 
// var-args are used in java and their usage is same as like the use of the rest operator in javascript

// example of var-args in java
// void pro(int... x)

// example of rest operator in javascript
// void pro(...x)


// var-args in java is basically a technique through which we can pass 0 or any more arguments of the same type as argument to the method. Internally java takes all the arguments and creates an array of that type and then store the values into them and that that array object is actually stored in the formal argument(parameter)var-args of the variable