class Object{
    
}
//this is correct because we can create Object class of our own

class F{
    public static void main(String[] args){
        Object x = new Object();
        x.toString();
    }
}
//this will give no error because Object class of library class is the parent of Object class of same file also