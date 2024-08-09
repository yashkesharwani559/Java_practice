class SuperHuman {
    
}

class SpiderMan extends SuperHuman {
    
}

class ChhotaSpiderMan extends SpiderMan {

}

class ShaktiMan extends SuperHuman {
    
}

class K2 {
    public static void main(String[] args) {
        SuperHuman sh = new SpiderMan();

        SpiderMan y1 = (SpiderMan)sh;
        ChhotaSpiderMan y2 = (ChhotaSpiderMan)sh;
    }    
}
//this will give runtime exception as
// Exception in thread "main" java.lang.ClassCastException: class SpiderMan cannot be cast to class ChhotaSpiderMan (SpiderMan and ChhotaSpiderMan are in unnamed module of loader 'app')
//         at K2.main(K2.java:22)