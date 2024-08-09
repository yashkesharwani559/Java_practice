import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class A1 {
    public static void main(String[] args){
        File f = new File("abc.txt");

        try{
            FileWriter fw = new FileWriter(f);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
// Here we are using the File object parameterized constructor of the FileWriter class to create a FileWriter class object
// FileWriter(File file) -> throws an IOException that is a checked exception . Returns an object of the FileWriter class
// it throws IOException - if the file exists but is a directory rather than a regular file, does not exist but cannot be created, or cannot be opened for any other reason
// this constructor will give IOException also when the file is not there but String parameterized constructor