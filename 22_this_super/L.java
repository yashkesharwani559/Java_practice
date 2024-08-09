public class L extends X {
    void pro()   {
        System.out.println("pro in L");//pro in L
        super.pro();//pro in X
    }
    
    public static void main(String[] args){
        L x = new L();

        x.pro();
    }
}

class X{
    void pro(){
        System.out.println("pro in X");
    }
}
