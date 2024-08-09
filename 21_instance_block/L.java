public class L {
    {
        pro();
    }

    void pro() {
        System.out.println(y);
    }

    int y = 90;

    public static void main(String[] args) {
        L x = new L();

        x.pro();
    }
}
//this will print output as
// 0
// 90

//by seeing this output we can predict that sequence of running the blocks and initializing variables as
//
//constructor called
// 1. instance method registered with the object
//2. instance block runs
// 3. instance method is called
// 4. instance variables are created and initialized with default value
// 5. print 0
// 6. now run of the method and instance block completes
// 7. now constructor initializes the instance variable with value 90 and then constructor completes its execution
// 8. now pro() method is called from the main() method and prints 90
