class Object{
    public String toString(){
        System.out.println("Yash is a boss");
        return "yash";
    }
}
// here we have write the toString() method in the our created Object class then the method of the alpha class Object is overridden

class F1{
    public static void main(String[] args){
        Object x = new Object();
        x.toString();
    }
}