class T2{
    public static void main(String[] args){
        System.out.println(1);
        try{
            System.out.println(2);
            int[] x = {1, 2};
            System.out.println(x[2]);
            String s = null;
            System.out.println(s.length());
        }
        catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
            System.out.println("exception");
        }
    }
}//here above is the way using which we can write multiple exceptions in only one catch block using the (bitwise or operator | )
//bitwise or operator can be used to write the name of two or more exception class in the same catch block
