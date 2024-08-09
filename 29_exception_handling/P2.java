public class P2 {
    public static void main(String[] args) {
        
        System.out.println(1);

        try{
            if(args.length == 0){
                MyMissingException2 x = new MyMissingException2("No input from command line");
                throw x;
            }
        }catch(MyMissingException2 e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        
    }
}

class MyMissingException2 extends RuntimeException{
    MyMissingException2(){

    }
    MyMissingException2(String message){

    }
}

//output
// 1
// MyMissingException2
// null