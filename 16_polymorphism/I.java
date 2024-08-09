class SuperMan extends SuperHuman{
    void spin(){

    }
}

class SuperHuman{
    void power(){

    }
}

class SpiderMan extends SuperHuman{
    void throwWeb(){

    }
}

class I{
    public static void main(String[] args){
        SuperHuman sh = new SpiderMan();
        sh.power();
        sh.throwWeb();//this will give compilation error
    }
} 
//this will give error as
// I.java:23: error: cannot find symbol
//         sh.throwWeb();
//           ^
//   symbol:   method throwWeb()
//   location: variable sh of type SuperHuman
// 1 error