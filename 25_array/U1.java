public class U1 {
    public static void main(String[] args){
        // Object[][][] x = new int[2][2];//compilation error

        // a 3D array cannot store a 2D array object

        Object[] x = new int[2][3];//valid only in case of the Object class variable or Object class array variable 
        //this is because the Object class is the parent of all type of arrays

        //so this means Object class variable is the only variable that can store the object of any type of array
        
        // String[] x1 = new String[2][2];//not ok compilation error 
        // String[][] x1 = new String[2];//not ok compilation error 
        // int[] a = new int[2][2];//not ok compilation error
        // int[][] a = new int[2];//not ok compilation error
        //this means that the nD array variable can store only the nD array object 
        // except in case of Object class variable

    }
}
