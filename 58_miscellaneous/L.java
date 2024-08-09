public class L {
    public static void main(String[] args) throws ClassNotFoundException {
        Class a = Class.forName("L");

        System.out.println(a);//class L

    }
}

//public static Class<?> forName(String class-name) throws ClassNotFoundException  -->  this method is present in the Class class in java. Class is present in java.lang package. And that's why no need to import it.
//static forName(String class-name) --> forName() is a static method so it can only be called using Class.forName().
// forName() takes one String as argument which has a name of a class with package.
// Class forName() -> forName() method returns the reference code of that class Class object for the class name given in the argument
// forName() --> method throws the ClassNotFoundException (checked exception) present in java.lang package. So we must have to handle this exception
// forName() also throws two errors 
// LinkageError - if the linkage fails
// ExceptionInInitializerError - if the initialization provoked by this method fails
//The main feature of the forName() method is that if the Class object is not already created but the .class file for that class is kept there, then it dynamically(at the runtime) loads the class Class object of that class.