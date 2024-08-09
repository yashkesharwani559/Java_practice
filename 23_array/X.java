public class X {
    public static void main(String[] args){
        int[] x = new byte[3];//this is not a legal code
    }
}
//this will give error as
// X.java:3: error: incompatible types: byte[] cannot be converted to int[]
//         int[] x = new byte[3];//this is not a legal code
//                   ^
// 1 error
// error: compilation failed

//java is designed like this because if the java make legal to assign the byte array object to the int array reference variable then it will allow to assign the variables of the array with a value greater than the range which will give exception that's why to prevent this 
// to prevent this java doesnot allows to this type of syntax