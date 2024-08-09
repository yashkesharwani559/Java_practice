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
        System.out.println(sh instanceof SpiderMan);//this will print false
        sh.power();
        sh.spin();//this will give compilation error because compiler only checks the type of variable and then checks that spin() method is there in the SuperHuman or not and here it is not there that's why it will give compilation error
        
    }
}

// I2.java:22: error: cannot find symbol
//         sh.spin();//this will give compilation error because compiler only checks the type of variable and then checks that spin() method is there in the SuperHuman or not and here it is not there that's why it will give compilation error
//           ^
//   symbol:   method spin()
//   location: variable sh of type SuperHuman
// 1 error