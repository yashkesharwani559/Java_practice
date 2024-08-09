public class N extends A {
    void pro(){}
}

class A{
    private void pro(){

    }
}

//no compilation error because pro is private and hence it is not inheriting in the child class and the method we have created in the child class N will be treated as a new method and a new method can have any type of access modifier
