public class B {
    public static void main(String[] args) {
        
        System.out.println(1);

        try{
            System.out.println(2);
        }

    }
}

//this will give compilation error because 
// try cannot be written without try, catch or resource declaration

//compilation error
// B.java:6: error: 'try' without 'catch', 'finally' or resource declarations
//         try{
//         ^
// 1 error
// error: compilation failed
