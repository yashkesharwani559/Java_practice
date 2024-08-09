public class W1 {
    public static void main(String[] args){

        char c = 'A';
        byte b = 45;
        short s = 34;
        int i = 34;

        int[] x = {  c, b, s, i, 34 };
        
        for(int a: x)
        System.out.println(a);

    }
}

//this will give output as
// 65
// 45
// 34
// 34
// 34