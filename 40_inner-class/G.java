class G {
    
    class X{
        int w = 45;
        void info(){
            int w = 10;
            System.out.println(w);
            System.out.println(this.w);
        }
    }
    public static void main(String[] args){
        new F().info();
    }
}