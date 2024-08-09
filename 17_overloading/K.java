class LeafVegetable {

}

class P extends LeafVegetable {
}

class L extends LeafVegetable {
}

class B extends LeafVegetable {
}
public class K {
    static void createfood(LeafVegetable l) {
        System.out.println(l);
    }

    
    public static void main(String[] args) {
        B b = new B();
        L l = new L();
        P p = new P();
        LeafVegetable lf = new LeafVegetable();
        createfood(b);
        createfood(l);
        createfood(p);
        createfood(lf);
    }
}
