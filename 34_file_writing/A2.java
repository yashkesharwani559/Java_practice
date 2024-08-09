import java.io.FileWriter;
import java.io.IOException;

class A2 {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("abc.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
// Here we are using the File object parameterized constructor of the FileWriter class to create a FileWriter class object
// FileWriter(String path) -> throws an IOException that is a checked exception . Returns an object of the FileWriter class
// it throws IOException - if the named file exists but is a directory rather than a regular file, does not exist but cannot be created, or cannot be opened for any other reason
// here it will tries to create the file if doesnot exist and if he can't create the file then it gives the IOException