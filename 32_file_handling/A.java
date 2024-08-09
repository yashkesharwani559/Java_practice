class A{
    public static void main(String[] args){
        System.out.println(1);
        File f = new File("abc.txt");
    }
}

//compilation error because File class is in the java.io package

// A.java:4: error: cannot find symbol
//         File f = new File("abc.txt");
//         ^
//   symbol:   class File
//   location: class A
// A.java:4: error: cannot find symbol
//         File f = new File("abc.txt");
//                      ^
//   symbol:   class File
//   location: class A
// 2 errors
// error: compilation failed