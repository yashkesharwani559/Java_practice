class A{
    public static void main(String[] args){
        A x = new A();
        System.out.println(x instanceof A);
        System.out.println(x instanceof Object);
    }
}
//this will give no error 
// line 5 will give true because Object is the ultimate parent of all class in java