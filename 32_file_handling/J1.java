import java.io.File;

public class J1 {
    public static void main(String[] args) {

        File file = new File("abc4.txt");

        System.out.println(file.exists());//true

        File file2 = new File("monu.txt");

        System.out.println(file2.exists());//false

        System.out.println(file.renameTo(file2));//true
        //this will rename the file from abc4.txt to monu.txt but the file stores the old pathname only

        System.out.println(file);//abc4.txt

        System.out.println(file.exists());//false

        System.out.println(file2);//monu.txt

        System.out.println(file2.exists());//true

    }
}

// public boolean renameTo(File dest) --> is an instance method in the class File, that is used to rename the pathname, of the actual file/directory.
// Example:- f.renameTo(f1) --> 
// here it takes one argument as a File class object which contains the new pathname that we want to replace the pathname and from the File class object using which we call the renameTo() method contains the old pathname of the file/directory which we want to rename
// so it not changes the pathname of the file objects but it changes the name of the file/directory actually.
// and also a file name can be replacable only with a new file name and same is for the diretory.
// we can also use renameTo() method to replace the file/directory.
// returns true if and only if renaming is succeeded and otherwise returns false.
// so renameTo() method returns false if the calling file object pathname(file/directory) doesn't exist
// and if the replacing file class object pathname(file/directory) that we pass as argument already exists

//renameTo() method throws SecurityException (unchecked exception) which is thrown when a SecurityManager exists and its SecurityManager.checkWrite(String) method denies write access to either the old or new pathname.

//output
// true
// false
// true
// abc4.txt
// false
// monu.txt
// true