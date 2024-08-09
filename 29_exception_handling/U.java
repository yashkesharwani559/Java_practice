public class U {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
        System.out.println(4);
    }
}

//this means that finally block runs also when no exception comes in the try block

//output
// 1
// 2
// 3
// 4
