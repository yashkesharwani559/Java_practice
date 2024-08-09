interface N5{
    int y = 35;
}

class N{
    public static void main(String[] args){
        System.out.println(N5.y);
    }
}
//this is a valid code because by default a variable inside an interface is implicitly public static final . Thats why we can access final variables using interface name in java