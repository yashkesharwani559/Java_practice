public class E {
    public static void main(String[] args){
        
    }
}

// PrintWriter -> is a class present in java.io package that is also used to write in the file. It is the direct subclass of Writer abstract class. It has same methods like that in the PrintStream class. And the print(), printf(), println() are the methods of the PrintStream class that we use like System.out.println();
// so PrintWriter has methods and their overloaded versions with the names, append(), close(), flush(), print(), printf(), println(), format()
// in println() method there are versions where we can pass any primitive or class variable because it has many overloaded versions for all types but they only takes one argument. And that's why println() method can be used to write anything on the file
// here constructors are rich
// PrintWriter(File file)-> here we can pass object of File class
// PrintWriter(String path) -> here we can pass the path in the form of the String
// PrintWriter(Writer out) -> here we will pass the object of FileWriter class.
// but the two PrintWriter(File file) and PrintWriter(String path) parameterized constructors give the FileNotFoundException when he cannot create the file or the file cannot be opened to write
// and also most of the methods of the PrintWriter class don't throws any exception 