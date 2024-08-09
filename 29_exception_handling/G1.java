public class G1 {
    
}


//points to be remembered
/*
 * 1. Exception is a runtime problem in java
 * 
 * 2. Throwable is the parent concrete class of all problem classes and Throwable is the direct parent of Exception and Error class
 * 
 * 3. Error class is used when system failures occurs. So they are used when there is a system problem at the time of multithreading
 * 
 * 4. and all the childs of Exception and Error are concrete classes
 * 
 * 5. there is a child in the Exception class named RuntimeException that contains the exception that comes at runtime (generally code bugs/problems)
 * so RuntimeException is a child class of Exception that has its child classes which are used for general code bugs
 * 
 * //6. almost in each child of Error and Exception class contains two constructor- non-parameterized and String parameterized
 * 
 * //7. Exception class extends the Throwable class and implements the Serializable interface 
 * 
 * //8.Throwable class contains public constructors
 * 
 * //9. Throwable is the direct child of the Object class
 * 
 * //10. Thread is same as the stack so we can create as much stack as we want using multithreading but there is only one heap that is there in the java and we cannot create more heaps
 * 
 * //11.by Default, the program runs on a thread called main in java and thread = stack
 *  
 */
