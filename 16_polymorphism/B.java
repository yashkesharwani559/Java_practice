class X{}

class Y extends X{}

class Z extends Y{}

class B{
    public static void main(String[] args){
        Z x = new Z();
        Y y = new Z();
        X z = new Z();
        Object a = new Z();
    }
}
//this will give error because we can store child class object reference code in the parent class variable in java