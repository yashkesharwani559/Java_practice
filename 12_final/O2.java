class O2{
    final static int x;
    {
        x = 34;
    }
    public static void main(String[] args){
        O2 o = new O2();
        o.x;
    }
}

//this will give an error
// O2.java:8: error: not a statement
//         o.x;
//          ^
// 1 error
