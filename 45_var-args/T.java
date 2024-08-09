public class T {
    static void abc(long... n){
        for(long l : n){
            System.out.println(l);
        }
    }

    public static void main(String[] args){
        // abc(12, 45, 56);//allowed means we can directly pass int constants to long var-args

        int x = 56;
        abc(x, 45, 89);//allowed means we can pass int variables to var-args and then it converts it implicitly

        abc(x);//allowed
        
        abc(12l);//allowed

    }
}
//here we can pass a small size variable or constant into a big size var-args then it implicitly typecast it
// and that's why we can pass int value to the var-arg of long.