public class T {
    public static void main(String[] args){
        String[][][] x = new String[3][2][2];

        System.out.println(x[0][0][0] instanceof String);//false
        //this is printing false because the x[0][0][0] is an String reference vairable that is initialized by null (by default) and null doesnot pass is-a relation with the String class and that's it will print false
        
        //this is not giving compilation error  because x[0][0][0] is a reference variable for class String and right hand side the String is written

        x[0][0][0] = "yash";

        System.out.println(x[0][0][0] instanceof String);//true

        //this will print true because now x[0][0][0] stores the reference code of a String object

    }
}
