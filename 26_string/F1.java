class F1 {
    public static void main(String[] args){
        String s = new String("mohan");

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s[i]);
        }

    }
}

//this will give compilation error as
// F1.java:6: error: array required, but String found
//             System.out.println(s[i]);
//                                 ^
// 1 error
// error: compilation failed