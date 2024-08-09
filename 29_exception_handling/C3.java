public class C3 {
    public static void main(String[] args) {
        
        System.out.println(1);
        
        try{
            int x = 12/0;

            System.out.println(2);
            System.out.println(3);
            System.out.println(4);

        }
        catch(Exception e){

        }
        System.out.println(5);
        
    }
}

//here it is no problem that when we don't write anything inside the catch block

//output
// 1
// 5