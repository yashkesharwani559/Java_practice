public class E {
    E pro(){
        return this;//here we are using this as a value to return
    }

    public static void main(String[] args){
        E x = new E();

        E y = x.pro();
        
        if(x==y)
        System.out.println("same");
    }
}
