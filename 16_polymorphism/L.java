class Dada {

}

class Papa extends Dada {

}

class Beta extends Papa {

}

class BetaKaBeta extends Beta {

}

class L {
    public static void main(String[] args) {
        Object x = new Beta();
        
        Object a1 = (Beta)x;
        Object a2 = (Papa)x;
        Object a3 = (Dada)x;
        Object a4 = (Object)x;

        Object a5 = (BetaKaBeta)x;   // NOT OK
    }
}


// Exception in thread "main" java.lang.ClassCastException: class Beta cannot be cast to class BetaKaBeta (Beta and BetaKaBeta are in unnamed module of loader 'app')
//         at T.main(T.java:26)
