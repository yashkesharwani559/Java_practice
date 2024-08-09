public class X {
    void info(){
        YY x;//compilation fail

        class YY{//instance method local inner class

        }
    }
}
// compilation fail because inside the method the code runs from the top to bottom and that's why class YY is inaccessible before declaration


// X.java:3: error: cannot find symbol
//         YY x;//compilation fail
//         ^
//   symbol:   class YY
//   location: class X
// 1 error
// error: compilation failed