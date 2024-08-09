public class Q {
    public static void main(String[] args){
        //in the 2D array the array is created as the collection of the 1D array reference variables and then each 1D reference variable contain the 1D array object

        int[][] a = new int[2][3];
        System.out.println(a);
        System.out.println(a.length);

        System.out.println();
        System.out.println(a[0]);
        System.out.println(a[0].length);
        
        System.out.println();
        System.out.println(a[1]);
        System.out.println(a[1].length);
        
        System.out.println();
        System.out.println(a[0][0]);
        System.out.println(a[0][1]);
        System.out.println(a[0][2]);

        System.out.println();
        System.out.println(a[1][0]);
        System.out.println(a[1][1]);
        System.out.println(a[1][2]);
        
        System.out.println();
        // System.out.println(a[0][0].length);//this will give compilation error
        
        

    }
}

//after commenting line no.28 output will be
// [[I@5fdcaa40
// 2

// [I@6dc17b83
// 3

// [I@5e0826e7
// 3

// 0
// 0
// 0

// 0
// 0
// 0

