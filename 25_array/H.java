public class H {
    public static void main(String[] args) {
        // int i = 010;//a number with prefix 0 is considered as an octal number
        // System.out.println(i);//8

        // int i = 0b10;// a number with the prefix '0b' or '0B' is considered as a binary number in java
        // System.out.println(i);//2 
        
        // int i = 0xf34;
        int i = 0X1f;//a number with prefix '0x' or '0X' is considered as a hexadecimal number
        System.out.println(i);//31 

    }
}
//output
// 8

//this is because a number starting with 0 then java will consider that number as an octal number
// and when we use it then it will print its decimal number