class A{
    public static void main(String[] args) {
        
    }
}

//Object <----  Reader  <------  InputStreamReader <------  FileReader 
//So that's why FileReader class in the direct subclass of InputStreamReader class. FileReader class is used to read the contents of the file and then use it as we want.FileReader class is present in java.io package.

// FileReader has total 5 constructors but we generally used these two constructors:-

// 1. public FileReader(File f) throws FileNotFoundException --> it takes the object of File class as argument that has the file path. It throws FileNotFoundException which is a checked exception so it must be handled or declared.
// It throws FileNotFoundException when the file doesnot exist or if it is a directory or it cannot be opened for reading because of some issues

//2. public FileReader(String f) throws FileNotFoundException --> it takes the name of file in the form of String as argument.
// It throws FileNotFoundException which is a checked exception so it must be handled or declared.
// It throws FileNotFoundException when the file doesnot exist or if it is a directory or it cannot be opened for reading because of some issues
