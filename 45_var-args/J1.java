class J1 {
    J1(int... x){
        System.out.println("hello");
    }
    public static void main(String[] args){
        Integer i1 = 34;
        Integer i2 = 64;
        Integer i3 = 84;
        Integer i4 = 94;

        new J1(i1, i2, i3, i4);//correct
        // because unboxing is allowed in java

    }
}