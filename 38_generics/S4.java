public class S4<Q, T, R> extends SS {
    public static void main(String[] args) {
        SS<String, Integer> s = new S4<String, Integer, String>();

        s.process(12);

    }

    void process(Integer q) {
        System.out.println(q + "s4");
    }
}

//output 
// 12 ss
class SS<R, S> {
    void process(S r){
        System.out.println(r + "ss");
    }
}
