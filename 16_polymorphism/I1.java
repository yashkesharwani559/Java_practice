class SuperHuman{
    void power(){

    }
}
class SuperMan extends SuperHuman{
    void spin(){

    }
}
class SpiderMan extends SuperHuman{
    void throwWeb(){

    }
}

class I1{
    public static void main(String[] args){
        SuperHuman sh = new SuperMan();
        // System.out.println(SpiderMan instanceof sh);//this will give compilation error
        System.out.println(sh instanceof SpiderMan);//this will print false
        // System.out.println(SuperHuman instanceof sh);//this will give compilation error
    }
}