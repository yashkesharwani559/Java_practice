public class V1 {
    public static void main(String[] args) {

        for (String x : args) {
            System.out.println(x);
        }

    }
}

//> java V1.java mohan 12 87.34 true
//output
// mohan
// 12
// 87.34
// true

//so this means we can pass any value as argument to the args string array variable
