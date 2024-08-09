class A{
    public static void main(String[] args){
        
    }
}
// Writer class is present in java.io package and it is an abstract class
// here we are studying the classes:- 
// 1. BufferedWriter :- it is a direct subclass of the Writer class.present in java.io package;
// 2. PrintWriter :- it is a direct subclass of the Writer class. present in java.io package;
// 3. FileWriter :- it is the direct subclass of the OutputStreamWriter class, and OutputStreamWriter class is the direct subclass of the Writer subclass. Present in java.io package; FileWriter class has not defined any methods in it. It has all the methods that are inherited from its parents. Here it is there to use its constructors. FileWriter is a very raw class and that's why we can use it for basic writing operations on the file.
// FileWriter(String fileName) -> it takes a filepath in the form of String as input and that filepath is used as destination where we have to write the contents in the file and also if the path contains a filename and if the file is not there then it creates the file with that name. It throws IOException that is a checked exception. It throws IOException when the path isof a folder or when the permissions of creating a file is not allowed