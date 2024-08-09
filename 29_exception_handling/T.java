class T{
    public static void main(String[] args){
        System.out.println(1);
        try{
            System.out.println(2);
            int[] x = {1, 2};
            System.out.println(x[2]);
            String s = null;
            System.out.println(s.length());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception");
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("exception");
        }
    }
}
//here both catch are using the same code 