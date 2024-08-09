public class S1 {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);

        for(String x : args){
            System.out.print(x + ", ");
        }
    }
}

//here  we are passing arguments to the args String array
// we will do this as
// > java S1.java rohan sohan mohan

//this will print output as
// [Ljava.lang.String;@243c4f91
// 3
// rohan, sohan, mohan,

//so this is also a method so that we can input in the program in java 