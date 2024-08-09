//task2
//to print the number of the records that are even
 
public class P1 {
    public static void main(String[] args) {
        int[] a = { 13, 24, 11, 56, 34, 45, 57, 68, 798 };

        int count = 0;
        // for (int i = 0; i < a.length; i++) {
        //     if (a[i] % 2 == 0) {
        //         count++;
        //     }
        // }

        for (int x : a) {
            if(x % 2 == 0)
                count++;
        }

        System.out.println("So number of even records are " + count);
    }
}

//this will give output as
// So number of even records are 5
