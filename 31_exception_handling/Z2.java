public class Z2 {
    public static void main(String[] args){
        System.out.println(pro());
    }
    static void pro(){
        System.out.println("hi");
        return;
    }
}
//compilation error because pro() returns nothing

// Z2.java:3: error: 'void' type not allowed here
//         System.out.println(pro());
//                               ^
// 1 error
// error: compilation failed