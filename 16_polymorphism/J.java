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
        SuperHuman sh = new SuperMan();
        SpiderMan s = (SpiderMan)sh;
    }
}
//typecating parent class variable that contain other child class2 object into the child class1 object will not give any compilation error but give runtime exception as ClassCastException
// Exception in thread "main" java.lang.ClassCastException: class SuperMan cannot be cast to class SpiderMan (SuperMan and SpiderMan are in unnamed module of loader 'app')
//         at I4.main(J.java:17)