import java.util.Scanner;

public class I {
    static int a;

    static int[] arr = new int[a];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(arr.length);//0
        a = sc.nextInt();
        System.out.println(arr.length);//0
        
        arr = new int[a];
        
        System.out.println(arr.length);//23
        //so this means we can change the value of static variables but it will not update the array size because they are initialized much before the main method
        //but we can reupdate the size of of the array this is as
        // arr = new int[a];
        //so this means we can change the size of the arrsy object


    }
}
