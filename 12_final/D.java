final class A{
    int y = 34;

    void pro(){
        System.out.println("Hello");
    }
}

class B{
    public static void main(String[] args){
        A x = new A();

        System.out.println(x.y);

        x.pro();
    } 
}

//this will give no error because we cannot access final class through inheritance but we can access it through instantiation