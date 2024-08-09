class O4{
    final int x;
    static{
        x = 34;
    }
    public static void main(String[] args){
        System.out.println(new O4().x);
    }
}

//this will give error as
// O4.java:4: error: non-static variable x cannot be referenced from a static context
//         x = 34;
//         ^
// 1 error