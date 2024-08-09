public class V {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(pro());
    }

    static int pro(){
        try{
            System.out.println(2);
            return 5;
        } catch (ArithmeticException e) {
            return 4;
        }
        finally{
            System.out.println(3);
        }
    }
}

//output
// 1
// 2
// 3
// 5
