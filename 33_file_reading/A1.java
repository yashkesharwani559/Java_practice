

public class A1 {
    public static void main(String[] args){
        FileReader fr = new FileReader("abc.txt");
    }
}
//because FileReader class is in java.lang package

//compilation error as
// A1.java:5: error: cannot find symbol
//         FileReader fr = new FileReader("abc.txt");
//         ^
//   symbol:   class FileReader
//   location: class A1
// A1.java:5: error: cannot find symbol
//         FileReader fr = new FileReader("abc.txt");
//                             ^
//   symbol:   class FileReader
//   location: class A1
// 2 errors
// error: compilation failed