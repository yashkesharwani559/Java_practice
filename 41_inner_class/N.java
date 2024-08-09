public class N {
    int a = 45;
    void pro(){
        System.out.println("pro");
    }
    class X{
        X(){
            System.out.println("X");
        }
    }
    public static void main(String[] args){
        System.out.println(a)
        pro();
        new X();
        //all above three will give compilation error because the instance members of the class are not directly accessible from the static context
        // means the instance members can't be directly called from the static method in the same class
    }
}
