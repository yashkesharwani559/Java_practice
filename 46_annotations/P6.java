public class P6 {
    public static void main(String[] args) {
        PP6 x = new PP6();
        x.a = 23;
    }
}

class PP6 {
    @Deprecated
    int a = 56;
}
//this will generate a warning