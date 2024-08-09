public class Z3 {
    public static void main(String[] args){
        int x = pro();
    }
    static void pro(){
        System.out.println("hi");
        return;
    }
}
//compilation error because pro() returns nothing

// Z3.java:3: error: incompatible types: void cannot be converted to int
//         int x = pro();
//                    ^
// 1 error
// error: compilation failed