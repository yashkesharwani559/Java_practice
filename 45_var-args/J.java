class J {
    J(int... x){
        System.out.println("hello");
    }
    public static void main(String[] args){
        new J();//correct
        new J(12, 56);//correct
        
        int[] a = {34, 546, 677};

        new J(a);//correct

    }
}