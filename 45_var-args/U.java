public class U {
    static void abc(int... n){
        for(long l : n){
            System.out.println(l);
        }
    }

    public static void main(String[] args){
        // abc(12, 45, 56);//allowed means we can directly pass int constants to long var-args

        int x = 56;
        abc(x, 45, 89);//allowed means we can pass int variables to var-args and then it converts it explicitly
        
        abc(x);//allowed
        
        // abc(12l);//not allowed because long can't be implicitly typecast to int
        
        // abc(x, 45l, 89);//not allowed because long can't be stored to int


    }
}
