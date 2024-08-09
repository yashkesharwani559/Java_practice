public class U {
    public static void main(String[] args) {
        // case 1
        // Object[] x1 = new int[1];//this will give compilation error
        Object x1 = new int[1];// ok no error
        Object x2 = new int[1][2];// ok no error
        Object x3 = new int[1][2][3];// ok no error

        Object[] x4 = new int[1][2][3];// ok no error
        Object[][] x5 = new int[1][2][3];// ok no error
        // Object[][][] x6 = new int[1][2][3];//not ok compilation error
        // this is because the int[] (int array) is an object and all Objects are child
        // of the alpha class Object
        // and also all type of array are the child of the Object class
        // and that's why they will not give compilation error
        // but at line no 11 we have assigned a 3D Object class array a 3D int array which is not possible because a class object cannot store the value of a primitive variable or a primitive literal (constant).

        int[] x = new int[2];

        System.out.println(x instanceof Object);// true
        // System.out.println(x instanceof Object[]);//not ok compilation error

    }
}

// case 1
// compilation error as
// U.java:3: error: incompatible types: int[] cannot be converted to Object[]
// Object[] x1 = new int[1];//this will give compilation error
// ^
// 1 error
// error: compilation failed
