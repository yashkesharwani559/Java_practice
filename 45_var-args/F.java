public class F {
    public static void main(String[] args) {
       
        String[] str = {"mohan", "sohan", "rohan", "gohan", "tohan"};
        
       pro(str);
    }

     
    static void pro(String... x) {
        System.out.println(x);
        System.out.println(x.length); 
        for (String next : x) {//traversing a var-arg using for-each loop
            System.out.println(next);
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