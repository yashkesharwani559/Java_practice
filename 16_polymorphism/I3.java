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

class I3{
    public static void main(String[] args){
        SuperHuman sh = new SpiderMan();
        sh.power();
        SpiderMan s = sh;//this will give compilation error because parent class variable cannot be implicitly assigned to child class variable
    }
}
//this will give error as
// I3.java:18: error: incompatible types: SuperHuman cannot be converted to SpiderMan
//         SpiderMan s = sh;//this will give compilation error because parent class variable cannot be implicitly assigned to child class variable
//                       ^
// 1 error