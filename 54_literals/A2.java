public class A2 {
    public static void main(String[] args){
        char c = 'n';

        System.out.println(c);
        c = '\u0010';//hexadecimal 0 - 65535
        System.out.println(c);
        c = '\'';
        System.out.println(c);
        c = '\\';
        System.out.println(c);
        c = '\123';//octal number
        System.out.println(c);
        c = 0x1234;//hexadecimal number valid code
        System.out.println(c);
        // c = 0x12345;//invalid code compilation error value greater than rnge of char
        c = 0b1010111;//binary
        System.out.println(c);
        
        c = 12345;//decimal
        System.out.println(c);
        c = 01234;//octal
        System.out.println(c);


    }
}

//output
// n

// '
// \
// S
// ?
// W
// ?
// ?
// 