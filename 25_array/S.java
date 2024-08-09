public class S {
    public static void main(String[] args){
        System.out.println(args);
        System.out.println(args.length);
    }
}
//this will print output as
// [Ljava.lang.String;@49d904ec
// 0

//this is because (String[] args) in argument creates an String 1D array but without passing it will creates an empty array without any String variables in it