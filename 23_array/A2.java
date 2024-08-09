public class A2 {
    static int[] arr;

    public static void main(String[] args){
        System.out.println(arr);//null 
    }
}

//this will give output as null becuase all class level variables are initialized by their default value and arr is a reference variable to store the reference code of the array object created in the heap
