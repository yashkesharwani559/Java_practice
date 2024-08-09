class SuperHuman{
    void power(){

    }
}
class SuperMan extends SuperHuman{
    void spin(){}
}

class SpiderMan extends SuperHuman{
    void throwWeb(){}
}

class I4{
    public static void main(String[] args){
        SuperHuman sh = new SpiderMan();
        sh.power();
        SpiderMan s = (SpiderMan)sh;
    }
}
//this will run without any error. this means that we can typecast implicitly the parent class variable that contain the child class1 object into the child class1 variable