class A{
    int x = 445;
}

class E extends A{
    int x = 45;

    void pro(){
        int x = 4;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
    public static void main(String[] args){
        E x = new E();
        x.pro();
    }
}
// this will print
// 4
// 45
// 445