public class E {
    public static void main(String[] args)  {
        pro("mohan", "sohan", "rohan", "gohan", "tohan");
    }

     
    static void pro(String... x) {
        System.out.println(x);
        System.out.println(x.length); 
        for (int i = 0; i < x.length; i++) {//traversing a var-arg using classical for loop
            System.out.println(x[i]);
        }
    }
}

//output
// [Ljava.lang.String;@36902638
// 5
// mohan
// sohan
// rohan
// gohan
// tohan