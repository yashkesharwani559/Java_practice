class X3 {
    int a = 12;
}

class J extends X3 {
    int a = 23;

    J() {
        int a = 9;
        System.out.println(a);//9
        System.out.println(this.a);//23
        System.out.println(super.a);//12
    }    

    public static void main(String[] args) {
        J c = new J();
    }
}