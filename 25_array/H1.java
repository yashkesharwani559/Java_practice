public class H1 {
    public static void main(String[] args){
        int i = 17;

        System.out.println(i);//17
        System.out.println(Integer.toOctalString(i));//21
        System.out.println(Integer.toHexString(i));//11
        System.out.println(Integer.toBinaryString(i));//10001
    }
}
//so this means that
// toOctalString(int )  ---> is a static method in java.lang.Integer that is used to convert int number to a number of the octal number system and return that number in the form of string

// toHexString(int )  ---> is a static method in java.lang.Integer that is used to convert int number to a number of the hexadecimal number system and return that number in the form of string

// toBinaryString(int )  ---> is a static method in java.lang.Integer that is used to convert int number to a number of the binary number system and return that number in the form of string
