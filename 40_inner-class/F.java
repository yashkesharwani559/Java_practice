class F {
    int w = 45;
    void info(){
        int w = 10;
        System.out.println(w);
        System.out.println(this.w);
    }
    class X{

    }
    public static void main(String[] args){
        new F().info();
    }
}
// output
// 10
// 45