class X{

}
class Y{

}

class Z{

}

class D{
    public static void main(String[] args){
        Object a = new X();
        Object b = new Y();
        Object c = new Z();
    }
}
//this will give no error because Object is the only class whose variable can store the object reference code of any class in java