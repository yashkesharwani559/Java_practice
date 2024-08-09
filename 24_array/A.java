public class A {
    public static void main(String[] args) {
        Animal a = new Animal();
    }
}

//this will give compilation error as

// A.java:3: error: cannot find symbol
//         Animal a = new Animal();
//         ^
//   symbol:   class Animal
//   location: class A
// A.java:3: error: cannot find symbol
//         Animal a = new Animal();
//                        ^
//   symbol:   class Animal
//   location: class A
// 2 errors
// error: compilation failed

//this error is because we don't have the Animal class inside same file, and also we don't have its Animal.java and Animal.class file this time
// and we have created class Animal in the A_Exp.java file and that's why compiler don't search class Animal in A_Exp.java file