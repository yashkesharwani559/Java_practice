public class N {
    public static void main(String[] args){
        YY x = new XX();
        x.pro();//XX
    }
}

class XX extends YY{
    void pro() {
        System.out.println("XX");
    }
}


class YY{
    void pro(){
        System.out.println("YY");
    }
}