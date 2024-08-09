//example to convert int to String

class X4 {
    public static void main(String[] args){
        int a = 23;
        System.out.println(a + 2);//25

        //method 1
        // String s = Integer.toString(a);
        // System.out.println(s + 2);//232

        //method 2
        // String s = String.valueOf(a);
        // System.out.println(s + 2);//232

        //method 3
        // String s = Integer.valueOf(a).toString();
        // System.out.println(s + 2);//232
        
        //method 4
        String s = String.format("%d", a);
        System.out.println(s + 2);//232
    }
}