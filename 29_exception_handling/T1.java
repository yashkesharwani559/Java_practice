class T1{
    public static void main(String[] args){
        System.out.println(1);
        try{
            System.out.println(2);
            int[] x = {1, 2};
            System.out.println(x[2]);
            String s = null;
            System.out.println(s.length());
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("exception");
        }
    }
}
//here we have created one catch block of IndexOutOfBoundsException which is the parent of both the ArrayIndexOutOfBoundsException and StringArrayOutOfBoundsException. so this catch can handles both exceptions 